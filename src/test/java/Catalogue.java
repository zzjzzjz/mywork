import java.util.ArrayList;
import java.util.List;

public class Catalogue {//目录实体类
    public String path;//目录绝对路径
    public List<String> documents;//文件名字
    Catalogue(String path2){
        path=path2;
        documents=new ArrayList<>();
    }


}
