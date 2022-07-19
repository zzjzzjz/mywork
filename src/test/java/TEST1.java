import java.io.File;

public class TEST1 {
    public static void main(String args[]){

        String path="D:\\mywork\\music";
        Catalogue catalogue=new Catalogue(path);
        File file=new File(path);
        String[] strings=file.list();
        for(int i=0;i<strings.length;i++) {
            if(strings[i].split("\\.").length!=1){       //点需要正表达式分开

                catalogue.documents.add(strings[i]);

            }
            else {

                catalogue.documents.add(strings[i]);
            }
        }
        for(int i=0;i<catalogue.documents.size();i++){
            System.out.println(catalogue.documents.get(i));
        }


    }
}
