class Node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next  

class LinkedList:
    def __init__(self):
        self.head = None

    def insert_at_beginning(self, data):  
        node = Node(data, self.head)
        self.head = node
    
    def print(self):
        if self.head is None:
            print("Linked list is empty")
            return
        
        iterator = self.head
        linked_list_string = ' ' 
        while iterator:
            linked_list_string += str(iterator.data) + ' ~> '
            iterator = iterator.next
        print(linked_list_string)
    
    def insert_at_end(self, data):
        if self.head is None:
            self.head= Node(data, None)
            return
        iterator= self.head
        while iterator.next:
            iterator= iterator.next
        
        iterator.next = Node(data, None)
    
    def insert_values(self, data_list):
        self.head= None
        for data in data_list:
            self.insert_at_end(data)

    def get_length(self):
        count= 0
        iterator= self.head
        while iterator:
            count+=1
            iterator= iterator.next
        
        return count

    def remove_at(self,index):
        if index<0 or index>= self.get_length():
            raise Exception("Invalid Index")
        
        if index==0:
            self.head= self.head.next
            return
        count= 0 
        iterator= self.head
        while iterator:
            if count == index -1:
                iterator.next= iterator.next.next
                break
            
            iterator= iterator.next
            count+= 1
    
    def insert_at(self, index, data):
        if index<0 or index>self.get_length():
            raise Exception("Invalid Index")
        
        if index==0:
            self.insert_at_beginning(data)
            return
        
        count= 0
        iterator= self.head
        while iterator:
            if count== index - 1:
                node= Node(data, iterator.next)
                iterator.next= node
                break

            iterator= iterator.next
            count+= 1


if __name__ == '__main__':
    linked_list = LinkedList()
    linked_list.insert_values(["banana", "mango", "grapes", "orange"])
    linked_list.print()

