*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${URL}             https://www.wikipedia.org
${BROWSER}         Chrome
${SEARCH_TERM}     Python (programming language)
${SECTION}         History

*** Test Cases ***
User Should Be Able To Search And Navigate Wikipedia
    Open Browser    ${URL}    ${BROWSER}
    Maximize Browser Window
    Input Text      name=search    ${SEARCH_TERM}
    Wait Until Element Is Visible  css=button.pure-button-primary-progressive
    Click Element                  css=button.pure-button-primary-progressive
    Wait Until Element Is Visible    link=Python (programming language)
    Click Link     Python (programming language)
    Wait Until Element Is Visible    id=History
    Page Should Contain    ${SECTION}
    Close Browser
