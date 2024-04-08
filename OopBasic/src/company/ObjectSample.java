package company;
import java.nio.channels.NonWritableChannelException;

public class ObjectSample {

    public static void main(String[] args) {
        //インスタンスの作成（クラスを参考にしている）
        var salesDepartment = new Department("営業部", "xx", 1000000);
        var sales = new Sales("鈴木", salesDepartment, "課長", 100);

        //インスタンスメソッドの呼び出し
        
        sales.report();
        sales.report(2);
        sales.joinMeeting();
        
        
        //1行空ける
        System.out.println(" ");
        
        //インスタンスの作成
        
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("田中", devDepartment, "一般社員", 88,"Java");
        
        //インスタンスメソッドの呼び出し
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
      //ポリモーフィズムの確認(Employeeクラスを指定して、Emgineerオブジェクトを代入）
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        //エンジニアクラスからエンジニアインスタンスを作成して、プロジェクトマネージャーインスタンスに代入）
        
        //プロジェクトマネージャーインスタンス
        projectManager.report();//インスタンス.メソッド名（）でインスタンスメソッドを呼び出し
        //プロジェクトマネージャーインスタンスのレポートメソッドを呼び出し
        
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer){//もしプロジェクトマネージャーオブジェクトがエンジニアクラスならば）
            // developSoftwareメソッドを呼び出す
            ((Engineer) projectManager).developSoftware();
        
        }
        

        // ----- 追記（ここから） -----
        // 1行空ける
        System.out.println("");

        // アルバイトインスタンスの作成
        var parttimeWorker = new ParttimeWorker("太田", salesDepartment);
        
        // 実装したメソッドの呼び出し
        ((Workable) sales).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWorker).work();
        // ----- 追記（ここまで） -----

        
        
        }
    
        
}      

