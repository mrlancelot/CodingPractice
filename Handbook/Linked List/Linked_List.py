class Node:
    def __init__(self, data=None, next=None) -> None:
        self.data = data 
        self.next = next

class LinkedList:
    def __init__(self) -> None:
        self.head = None

    def insert_begin(self,data):
        node = Node(data, self.head)
        self.head = node   

    def insert_end(self,data):
        if self.head is None:
            self.head = Node(data,None)
            return
        
        itr = self.head
        while itr.next:
            itr = itr.next
        itr.next = Node(data,None)
    
    def insert_values(self,data_list):
        self.head = None
        for d in data_list:
            self.insert_end(d)


    def print(self):
        if self.head is None:
            print("Linked list empty")
            return
        
        itr = self.head
        llstr = ''

        while itr:
            llstr += str(itr.data) + "--"
            itr = itr.next
        
        print(llstr[:-2])
    
    def get_length(self):
        count = 0
        itr = self.head
        while itr:
            itr = itr.next
            count += 1
        return count
    
    def remove_at(self, ind):
        if (ind < 0 or ind >= self.get_length()):
            raise Exception('Not a Valid ind')

        if ind == 0:
            self.head = self.head.next
            return

        count = 0
        itr = self.head
        while itr:
            if count == ind-1:
                itr.next = itr.next.next
                break
            itr = itr.next
            count +=1 

if __name__ == '__main__':
    print("start")
    ll = LinkedList()
    # ll.insert_end("a")
    # ll.insert_end("b")
    # ll.insert_end("c")
    ll.insert_values(['a','b','c','d','e'])
    ll.print()
    ll.remove_at(2)
    ll.print()