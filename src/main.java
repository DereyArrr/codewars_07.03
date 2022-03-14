
//Вы получаете массив чисел, возвращаете сумму всех положительных.
 class Positive{

    public static int sum(int[] arr){
        int c = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>0){
                c += arr[i];
            }
        }
        return c;
    }

}

//Вам даны lengthи width четырехугольника. Многоугольник может быть прямоугольным или квадратным.
//Если это квадрат, вернуть его площадь. Если это прямоугольник, верните его периметр.
class Solution {
    public static int areaOrPerimeter (int l, int w) {
        int s = 0;
        if(l==w){
            s = l*l;
        } else{
            s = 2*(l+w);
        }
        return s;
    }
}

public class main {
    public static void main(String[] args) {
        int c = Positive.sum(new int[]{1,2,3,4,5});
        System.out.println(c);

        int s = Solution.areaOrPerimeter(4,5);
        System.out.println(s);

    }
}
