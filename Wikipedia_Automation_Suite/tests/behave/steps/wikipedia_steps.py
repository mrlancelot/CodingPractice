from behave import given, when, then
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

@given('the user opens Wikipedia homepage')
def step_open_wikipedia(context):
    context.browser = webdriver.Chrome()
    context.browser.get('https://www.wikipedia.org')
    context.browser.maximize_window()  # Maximizes the window to prevent layout issues

@when('the user searches for "{search_term}"')
def step_search_term(context, search_term):
    search_box = WebDriverWait(context.browser, 10).until(
        EC.visibility_of_element_located((By.NAME, 'search'))
    )
    search_box.clear()
    search_box.send_keys(search_term)

@when('the user clicks the search button')
def step_click_search_button(context):
    # Wait until the button is clickable
    search_button = WebDriverWait(context.browser, 10).until(
        EC.element_to_be_clickable((By.CSS_SELECTOR, 'button.pure-button-primary-progressive'))
    )
    # Scroll the button into view
    context.browser.execute_script("arguments[0].scrollIntoView();", search_button)
    # Use JavaScript to click the button to avoid interception
    context.browser.execute_script("arguments[0].click();", search_button)

@when('the user clicks the first search result')
def step_click_first_result(context):
    # Wait until the first link is visible and clickable
    first_result = WebDriverWait(context.browser, 10).until(
        EC.element_to_be_clickable((By.LINK_TEXT, 'Python (programming language)'))
    )
    first_result.click()

@when('the user navigates to the "{section}" section')
def step_navigate_to_section(context, section):
    # Wait for the section to be visible
    section_element = WebDriverWait(context.browser, 10).until(
        EC.visibility_of_element_located((By.ID, section))
    )
    context.browser.execute_script("arguments[0].scrollIntoView();", section_element)

@then('the page should display "{text}"')
def step_verify_page_contains_text(context, text):
    assert text in context.browser.page_source, f"'{text}' not found in page source"
    context.browser.quit()
