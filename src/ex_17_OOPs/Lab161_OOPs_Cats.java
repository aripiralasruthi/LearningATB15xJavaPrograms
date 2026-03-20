package ex_17_OOPs;

public class Lab161_OOPs_Cats {
    public static void main(String[] args) {
        cat c = new cat();
        System.out.println(c);
        System.out.println(c.name);
        cat c1 = new cat("Anagha");
        //c.name = "Anagha";
        System.out.println(c1.name);
        }
    static class cat{
        String name;
        cat(){
            name = "piku";
        }
        cat(String nameGiven){
            this.name = nameGiven;
        }
    }
}
