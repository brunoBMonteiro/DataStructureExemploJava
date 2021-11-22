public class Calculadora {

    enum Operacao{
        SOMAR("+"){
            public double executarOperacao(double x, double y){
                return x + y;
            }
        }, SUBTRAIR("-") {
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        }, MULTIPLICAR("*") {
            public double executarOperacao(double x, double y) {
                return x * y;
            }
        }, DIVIDIR("/") {
            public double executarOperacao(double x, double y) {
                return x / y;
            }
        };

        private String simbolo;

        Operacao(String simbolo){
            this.simbolo = simbolo;
        }

        public abstract double executarOperacao(double x, double y);


        public String toString() {
            return this.simbolo;
        }
    }

    public static void main(String[] args) {
        double x = 5.0;
        double y = 3.0;

                    for (Operacao op: Operacao.values()
                         ) {
                        System.out.print(x + " ");
                        System.out.print(op.toString() + " ");
                        System.out.print(y + " = ");
                        System.out.println(op.executarOperacao(x, y));
                    }
    }
}
