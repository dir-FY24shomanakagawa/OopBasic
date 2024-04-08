package company;

public class Engineer extends Employee {
    String programmingLanguage;
    
    public Engineer(String name, Department department, String position, int employeeId, String programmingLanguage) {
        super(name, department, position, employeeId);//super()メソッドで継承元のクラスのコンストラクターを呼び出せる
        this.programmingLanguage = programmingLanguage;
    }
    
        //これはエンジニアフィールドのメソッド
        public void developSoftware() {
            
            System.out.println("ソフトウェアを開発します。名前：" + name +
                    "、プログラミング言語：" + programmingLanguage);
        }
        
        @Override//サブクラスが「スーパークラスから継承したメソッド」を新しいふるまいで再定義することをオーバーライド
        public void joinMeeting() {
            department.meeting();
            System.out.println("→技術的な準備を行い、上記の会議に参加します。名前：" + name);
            
        }
        
    }

