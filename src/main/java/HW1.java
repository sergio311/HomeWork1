public class HW1 {
        public static void main(String[] args){
            calc();
            factorial();
            reverse();
        }



        public static void calc()
        {
            int a,b,c=0;
            float answ=0;
            a=2;
            b=3;
            c=1;

            if(a%2==0)
                answ = a * b / c;
            if ((a+c)%2==0||(b+c)%2==0)
                answ = a * b / c;
            else
                answ = a+b-c;

            System.out.println(answ);

        }


        public static void factorial()
        {
            int n = 3;
            int fact=1;
                for (int i=1; i<n; i++)
                fact = fact*i;

            System.out.println(fact);
        }


    public static void reverse()
    {
        int x=554636;

        int tempx=0;

        int ost=1;
        int des=0;
        int desatie=0;

        int answ=0;


        while (x!=0)
        {
            ost=x%10;
            tempx=x;
            for (int i=1; tempx!=0; i++)
            {
                tempx=tempx/10;
                des=i;
            }

            x=x/10;

            desatie = 1;

            for(int i=0; i<des-1;i++)
            {
                desatie = desatie*10;
            }

                answ = answ + (ost*desatie);
        }

        System.out.println(answ);

    }
}

