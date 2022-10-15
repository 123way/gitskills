package 项目版本管理;

import java.util.ArrayList;

public class SchoolSystem implements ISignUp{
    public static void main(String[]args) {
        String str="1,2,3,1";
        //IParams params = ISignUp.parse();
        String []a=str.split(",");
        int []n=new int[a.length];
        SchoolSystem sc = new SchoolSystem(1, 1, 0);
        for (int i = 0; i <a.length; i++) {
            sc.addStudent(n[i]);
        }
        sc.print();
    }
    int big,medium,small;
    ArrayList plan = new ArrayList();
    public SchoolSystem(int big,int medium,int small){
        this.big=big;
        this.medium=medium;
        this.small=small;
        plan.add(null);
    }
    public boolean addStudent(int stuType){
        if(stuType==1&&big>0){
            big--;
        }
        else if(stuType==2&&medium>0){
            medium--;
        }
        else if(stuType==3&&small>0){
            small--;
        }
        else {
            plan.add(false);
            return false;
        }
        plan.add(true);
            return true;

    }
    public void print(){
        for(int i=0;i<plan.size();i++) {
            System.out.print(plan.get(i)+" ");
        }
    }
}
