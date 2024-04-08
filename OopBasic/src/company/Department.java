//Departmentクラスを定義
package company;

public class Department {
    //finalはキーワードを用いることで、フィールド（属性）が初期化後に変更されることを防ぐ。
    private final String name;
    private final String departmentId;
    private final int budget;
    
    //コンストラクター（コンストラクターとはインスタンス生成直後に自動的に生成される）
    public Department(String name, String departmentId, int budget) {
        
        //メソッド内でインスタンスフィールドにアクセス
        this.name = name;
        this.departmentId = departmentId;
        this.budget = budget;
        
    }
    
    //会議を開催する
    public void meeting() {
        System.out.println("部内会議を開催します。　部署：" + name + "、予算：" + budget);
    }
    
    //nameのgetter（クラス外からプライベートフィールドをとるためのもの）
    public String getName() {
        return name;
    }
    
    //budgetのgetter
    public double getBudget() {
        return budget;
    }

    //budgetのsetter　フィールドのアクセス権をprivateにすると、当然フィールドの値をクラスの外から変更することもできなくなります。そこでセッターを使う。セッターとはフィールドの値を変更するメソッド
    public void setBudget(int budget) {
        if (budget < 0) {
            throw new IllegalArgumentException("予算はマイナスにできません。");
        }
        this.budget = budget;
       
    }
}
