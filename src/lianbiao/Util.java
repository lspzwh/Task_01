package lianbiao;

public class Util {
    //创建
    public Double create(){
        return new Double(0);
    }
    //打印全部
    public void printAll(Double head){
        Double h1=head;
        while(h1.getAfter()!=head){
            System.out.println(h1.getData());
            h1=h1.getAfter();
        }
        System.out.println(h1.getData());
    }
    //添加到尾部
    public void add(Double head,int data){
        Double next=new Double(data);
        next.setAfter(head);
        head.setBefore(next);
        Double h1=head;
        while(h1.getAfter()!=head){
            h1=h1.getAfter();
        }
        h1.setAfter(next);
        next.setBefore(h1);
    }
    //得到节点数
    public int getNum(Double head){
        int num=1;
        Double h1=head;
        while(h1.getAfter()!=head){
            h1=h1.getAfter();
            num++;
        }
        return num;
    }
    //删除尾部
    public void deleteLast(Double head){
        Double h1=head;
        while(h1.getAfter().getAfter()!=head){
            h1=h1.getAfter();
        }
        h1.setAfter(head);
        head.setBefore(h1);
    }
    //产出指定index
    public void delete(Double head ,int index){
        int realNum=getNum(head);
        if(index<=0||index>=realNum){
            System.out.println("删除错误");
        }else{
            Double h1=head;
            for(int i=index-1;i>0;i--){
                h1=h1.getAfter();
            }
            h1.setAfter(h1.getAfter().getAfter());
            h1.getAfter().getAfter().setBefore(h1);
        }
    }
    //修改指定index
    public void change(Double head,int data,int index){
        int realNum=getNum(head);
        if(index<0||index>=realNum){
            System.out.println("修改失败");
        }else{
            Double h1=head;
            for(int i=index;i>0;i--){
                h1=h1.getAfter();
            }
            h1.setData(data);
        }
    }
    //查找
    public int search(Double head,int num){
        int index=0;
        boolean flag=false;
        Double h1=head;
        while(h1.getAfter()!=head){
            if(h1.getData()==num){
                flag=true;
                break;
            }
            index++;
            h1=h1.getAfter();
        }
        if(h1.getData()==num) flag=true;
        int result=-1;
        if(flag) result=index;
        return result;
    }
}
class Double{
    private Double before=this;
    private Double after=this;
    private int data;
    public Double(int data){
        this.data=data;
    }

    public Double getAfter() {
        return after;
    }

    public int getData() {
        return data;
    }

    public Double getBefore() {
        return before;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setAfter(Double after) {
        this.after = after;
    }

    public void setBefore(Double before) {
        this.before = before;
    }
}

