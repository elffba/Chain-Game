public class SingleLinkedList {

    public Node head;

    public void add(Object dataToAdd) {
        Node newNode = new Node(dataToAdd);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getLink() != null) {
                temp = temp.getLink();
            }
            temp.setLink(newNode);

        }
    }

    public int size() {
        if (head == null) return 0;

        else {
            Node temp = head;
            int count = 0;

            while (temp != null) {
                count++;
                temp = temp.getLink();
            }
            return count;
        }

    }

    public void display(){
        if(head == null)
            System.out.println();

        else {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.getData()+ "  ");
                temp = temp.getLink();
            }
        }
    }

    public void displayForScreen(){

        if(head == null)
            System.out.println();

        else {
            Node temp = head;
            while(temp != null){
                System.out.println(temp.getData());
                temp = temp.getLink();
            }
        }

    }

    public boolean searching( Object item){

        boolean flag = false;
        if (head == null)
            System.out.println("linked list is empty");
        else {
            Node temp = head;
            while (temp != null) {
                if (item == temp.getData())
                    flag = true;
                temp = temp.getLink();
            }
        }
        return flag;
    }

    public Object get(int index) {
        if (head == null || index < 0) {
            return null;
        } else {
            Node temp = head;
            int count = 0;

            while (temp != null && count < index) {
                count++;
                temp = temp.getLink();
            }

            if (temp == null) {
                return null;
            } else {
                return temp.getData();
            }
        }
    }


    public void remove(int index) {
        if (head == null || index < 0) {
            return;
        }

        if (index == 0) {
            head = head.getLink();
        } else {
            Node temp = head;
            int count = 0;

            while (temp != null && count < index - 1) {
                count++;
                temp = temp.getLink();
            }

            if (temp != null && temp.getLink() != null) {
                temp.setLink(temp.getLink().getLink());
            }
        }
    }




    public void set(int index, Object newValue) {
        if (head == null || index < 0) {
            return;
        } else {
            Node temp = head;
            int count = 0;

            while (temp != null && count < index) {
                count++;
                temp = temp.getLink();
            }

            if (temp != null) {
                temp.setData(newValue);
            }
        }
    }



}
