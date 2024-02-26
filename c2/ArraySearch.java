public class ArraySearch {
public static void main(String[] args) {
System.out.println("DENNY T DILEEP \n 23MCA025 \n 26-FEB-2024");
int[] array = { 1, 5, 9, 2, 4, 7 };
int target = 4;
boolean found = false;

for (int i = 0; i < array.length; i++) {
if (array[i] == target) {
found = true;
break;
}
}

if (found) {
System.out.println("Element " + target + " found in the array.");
} else {
System.out.println("Element " + target + " not found in the array.");
}
}
}
