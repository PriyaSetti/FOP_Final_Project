package FinalProject;

import java.util.*;

class dnode
{
    public String number = new String(new char[50]);
    public String gmail = new String(new char[40]);
    public String name = new String(new char[30]);
    public dnode prev;
    public dnode next;
    public dnode(String n, String r, String g)
    {
        name = n;
        number = r;
        gmail = g;
        next = null;
        prev = null;
    }
}
class dlist
{
    private dnode head;
    private dnode temp;
    private dnode ptr;

    private dnode ptr1;
    private dnode ptr2;
    private dnode dup;
    public dnode prevn;
    Scanner sc = new Scanner(System.in);

    public final int strcmp(String a, String b){
        return a.compareTo(b);
    }
    public final void insert()
    {
        accept();
    }

    public final void sort()
    {
        dnode i;
        dnode j;
        int temp;
        String n = new String(new char[10]);
        for (i = head;i.next != null;i = i.next)
        {
            for (j = i.next;j != null;j = j.next)
            {
                temp = strcmp(i.name,j.name);
                if (temp > 0)
                {
                    n = i.name;
                    i.name = j.name;
                    j.name = n;
                }
            }
        }

    }

    public final void searchbyname(String na)
    {
        ptr = head;
        while (ptr != null)
        {
            if (strcmp(na,ptr.name) == 0)
            {
                System.out.print("NAME FOUND");
                System.out.print("\n");
                System.out.print("CONTACT DETAILS ARE BELOW:\n");
                System.out.print("\n");
                System.out.print("\n\nNAME  ::\t");
                System.out.print(ptr.name);
                System.out.print("\nNUMBER::\t+91-");
                System.out.print(ptr.number);
                System.out.print("\nG-MAIL::\t");
                System.out.print(ptr.gmail);

            }
            ptr = ptr.next;
        }
    }

    public final void searchbynumber(String num)
    {
        ptr = head;
        while (ptr != null)
        {
            if (strcmp(num,ptr.number) == 0)
            {
                System.out.print("NUMBER FOUND\n");
                System.out.print("\n");
                System.out.print("CONTACT DETAILS ARE BELOW:\n");
                System.out.print("\n");
                System.out.print("\n\nNAME  ::\t");
                System.out.print(ptr.name);
                System.out.print("\nNUMBER::\t+91-");
                System.out.print(ptr.number);
                System.out.print("\nG-MAIL::\t");
                System.out.print(ptr.gmail);

            }
            ptr = ptr.next;
        }
    }

    public final void searchbygmail(String gm)
    {
        ptr = head;
        while (ptr != null)
        {
            if (strcmp(gm,ptr.gmail) == 0)
            {
                System.out.print("G-MAIL FOUND\n");
                System.out.print("\n");
                System.out.print("CONTACT DETAILS ARE BELOW:\n");
                System.out.print("\n");
                System.out.print("\n\nNAME  ::\t");
                System.out.print(ptr.name);
                System.out.print("\nNUMBER::\t+91-");
                System.out.print(ptr.number);
                System.out.print("\nG-MAIL::\t");
                System.out.print(ptr.gmail);

            }
            ptr = ptr.next;
        }
    }

    // dnode *head,*temp,*ptr;
    // friend class apply;
    // class apply()
    // {

    // }
    public final void accept()
    {
        String number = new String(new char[50]);
        String gmail = new String(new char[40]);
        String name = new String(new char[30]);
        char ans;
			  /*do
			  {*/
        System.out.print("ENTER NAME      :");
        name = sc.next();
        // cin.getline (name,30);
        System.out.print("ENTER NUMBER    :");
        number = sc.next();
        while (number.length() != 10)
        {
            System.out.print("ENTER VALID NUMBER  :");
            number = sc.next();
        }
        System.out.print("ENTER G-MAIL    :");
        gmail = sc.next();
        temp = new dnode(name, number, gmail);
        if (head == null)
        {
            head = temp;
        }
        else
        {
            ptr = head;
            while (ptr.next != null)
            {
                ptr = ptr.next;
            }
            ptr.next = temp;
            temp.prev = ptr;
        }
				/*System.out.print("DO YOU WANT TO CONTINUE?????????");
			ans = sc.next().charAt(0);
			  }while (ans == 'y');*/

    }

    public final void display()
    {
        ptr = head; //start the node
        while (ptr != null) //traverse till last
        {
            System.out.print("\n\nNAME  ::\t");
            System.out.print(ptr.name);
            System.out.print("\nNUMBER::\t+91-");
            System.out.print(ptr.number);
            System.out.print("\nG-MAIL::\t");
            System.out.print(ptr.gmail);
            ptr = ptr.next;
        }
    }

    public final void update(String n)
    {
        char ans;
        int c;
        ptr = head;
        while (ptr != null)
        {
            if (strcmp(n,ptr.name) == 0)
            {

                do
                {
                    System.out.print("\nWHAT DO YOU WANT TO UPDATE?\n1.NAME\n2.PHONE NUMBER\n3.G-MAIL\n");
                    c = Integer.parseInt(sc.next());
                    switch (c)
                    {
                        case 1:
                            System.out.print("ENTER NEW-NAME=");
                            ptr.name = sc.next();
                            break;
                        case 2:
                            System.out.print("ENTER NEW PHONE-NUMBER?");
                            ptr.number = sc.next();
                            while (ptr.number.length() != 10)
                            {
                                System.out.print("ENTER VALID NUMBER  :");
                                ptr.number = sc.next();
                            }
                            break;
                        case 3:
                            System.out.print("ENTER NEW G-MAIL");
                            ptr.gmail = sc.next();
                            break;
                    }
                    System.out.print("DO YOU WANT TO CONTINUE UPDATING?");
                    ans = sc.next().charAt(0);
                }while (ans == 'y');
            }
            ptr = ptr.next;
        }
    }

    public dlist()
    {
        head = null;
        temp = null;
        ptr = null;
        ptr1 = null;
        ptr2 = null;
        dup = null;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n = new String(new char[20]);
        String nam = new String(new char[20]);
        String name = new String(new char[10]);
        String number = new String(new char[10]);
        String gmail = new String(new char[20]);
        dlist d1 = new dlist();
        // apply d;
        char ans;
        int ch;
        int a;
        System.out.print("\n\nWHAT IS YOUR NAME?\n");
        name = new Scanner(System.in).next();
        System.out.print("\n\n!!!!!!!!!!!!!!!!!!!!!!!   WELCOME ");
        System.out.print(name);
        System.out.print("   !!!!!!!!!!!!!!!!!!!!!");
        System.out.print("\n\n\nLET'S CREATE OUR PHONEBOOK ");
        System.out.print(name);
        System.out.print("  \n\n");
        d1.accept();
        d1.sort();
        do
        {
            System.out.print("\n\n\n\n1) DISPLAY YOUR PHONE BOOK\n2) INSERT NEW CONTACT\n3) UPDATE DETAILS ON EXISTING CONTACT\n4) SEARCH\n");
            System.out.println("Enter your choice");
            ch = Integer.parseInt(sc.next());
            switch (ch)
            {
                case 2:
                    d1.insert();
                    d1.sort();
                    break;

                case 1:
                    // d1.sort();
                    d1.display();
                    break;
                case 3:

                    System.out.print("\n\nENTER THE NAME OF PERSON WHOSE DETAILS YOU WANT TO UPDATE...\n");
                    n = sc.next();
                    d1.update(n);
                    d1.sort();
                    break;
                case 4:
                    do
                    {
                        System.out.print("1.SEARCH BY NAME\n2.SEARCH BY NUMBER\n3.SEARCH BY GMAIL");
                        System.out.println("Enter your choice");
                        a = Integer.parseInt(sc.next());
                        switch (a)
                        {
                            case 1:
                                System.out.print("ENTER THE NAME TO BE SEARCHED\n");
                                name = sc.next();
                                d1.searchbyname(name);
                                break;
                            case 2:
                                System.out.print("ENTER THE NAME TO BE SEARCHED\n");
                                number = sc.next();
                                d1.searchbynumber(number);
                                break;
                            case 3:
                                System.out.print("ENTER THE NAME TO BE SEARCHED\n");
                                gmail = sc.next();
                                d1.searchbygmail(gmail);
                                break;
                            default:
                                System.out.print("\nNO PROPER INPUT GIVEN.....\n");
                        }
                        System.out.print("\nDO YOU WANT TO CONTINUE SEARCHING?????????\n");
                        ans = sc.next().charAt(0);
                    }while (ans == 'y');

                    break;
                default:
                    System.out.print("\nNO PROPER INPUT GIVEN..\n");
            }
            System.out.print("\n\nDO YOU WANT TO CONTINUE OPERATIONS?????????\n");
            ans = sc.next().charAt(0);
        }while (ans=='y');
    }
}