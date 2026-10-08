public class WrapperClassDemo
{
    public static void main(String[] args)
    {
        int primitiveInt = 100;
        float primitiveFloat = 25.75f;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;
        Integer wrappedInt = primitiveInt;
        Float wrappedFloat = primitiveFloat;
        Character wrappedChar = primitiveChar;
        Boolean wrappedBoolean = primitiveBoolean;
        System.out.println("Autoboxed Integer: " + wrappedInt);
        System.out.println("Autoboxed Float: " + wrappedFloat);
        System.out.println("Autoboxed Character: " + wrappedChar);
        System.out.println("Autoboxed Boolean: " + wrappedBoolean);
        int unboxedInt = wrappedInt;
        float unboxedFloat = wrappedFloat;
        char unboxedChar = wrappedChar;
        boolean unboxedBoolean = wrappedBoolean;
        System.out.println("Unboxed int: " + unboxedInt);;
        System.out.println("Unboxed float: " + unboxedFloat);
        System.out.println("Unboxed char: " + unboxedChar);
        System.out.println("Unboxed boolean: " + unboxedBoolean);
        String intString = "300";
        Integer parsedInt = Integer.parseInt(intString);
        String floatString = "75.25";
        Float parsedFloat = Float.parseFloat(floatString);
        String charString = "C";
        Character parsedChar = charString.charAt(0);
        String booleanString = "true";
        Boolean parsedBoolean = Boolean.parseBoolean(booleanString);
        System.out.println("Parsed and autoboxed Integer: " + parsedInt);
        System.out.println("Parsed and autoboxed Float: " + parsedFloat);
        System.out.println("Parsed and autoboxed Character: " + parsedChar);
        System.out.println("Parsed and autoboxed Boolean: " + parsedBoolean);
    }
}
/*
Implementation of Stack using Array
1.Push 2.Pop 3.Display 4.Exit
Enter your choice:
1
Enter the element
1
1.Push 2.Pop 3.Display 4.Exit
Enter your choice:
1
Enter the element
2
1.Push 2.Pop 3.Display 4.Exit
Enter your choice:
1
Enter the element
3
1.Push 2.Pop 3.Display 4.Exit
Enter your choice:
2
Popped element:3
1.Push 2.Pop 3.Display 4.Exit
Enter your choice:
3
Elements are:  1<-- 2<--
1.Push 2.Pop 3.Display 4.Exit
Enter your choice:4
*/
