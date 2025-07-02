class Function{
    public static int addition(int a,int b){
        int result = a +b;
        return result;

    }

    static int cube(int a){
        
        return a*a*a;
    }

    // returnDatatype functionName(parameter){}
    public static void main(String[] args) {
        int a = 5;
        int b = 19;
        int result = cube(a);
        System.out.println(result);
    }
}