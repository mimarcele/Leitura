package Livros;

public class Pessoa {
    //Atributos
        private String nome;
        private int idade;
        private String sexo;

        public void fazerAniver(){
            this.idade++;
        }
        //METODO CONSTRUTOR
        public Pessoa(String nome, int idade, String sexo){
            this.nome = nome;
            this.idade = idade;
            this.sexo = sexo;
        }

        //METODOS
        private void setNome(String nome){
            this.nome = nome;
        }
        String getNome(Livros.Pessoa leitor){
            return this.nome;
        }
        private void setIdade(int idade){
            this.idade = idade;
        }
        int getIdade(){
            return this.idade;
        }
        private void setSexo(String sexo){
            this.sexo = sexo;
        }
        String getSexo(){
            return this.sexo;
        }

        public String getNome() {
            return this.nome;
        }
    }
