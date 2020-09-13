package Livros;

public class ProjetoLivro {
        public static void main(String[] args) {
            Pessoa[] p = new Pessoa[3];
            Livro[] l = new Livro[3];

            p[0] = new Pessoa("Julia", 21, "F");
            l[0] = new Livro("Amy e o clube dos 27", "Howard Sounes", 416, p[0]);
            p[1] = new Pessoa ("Felipe", 24, "M");
            l[1] = new Livro ("Java para Web", "William Pereira Alves", 787, p[1]);
            p[2] = new Pessoa ("Clara", 20, "F");
            l[2] = new Livro ("O pequeno príncipe", "Anroine de Saint", 96, p[2]);


            l[0].abrir ();
            l[0].avancarPag ();
            l[2].abrir ();
            l[2].avancarPag ();
            System.out.println (l[0].detalhes () );
            System.out.println (l[1].detalhes () );
            System.out.println (l[2].detalhes () );



        }
    }


