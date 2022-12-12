package FinalProject;

import java.util.*;

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
