package Livros;

public class Livro implements Publicacao {
    // ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //METODOS

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                "\n, autor='" + autor + '\'' +
                "\n, totPaginas=" + totPaginas +
                "\n, pagAtual=" + pagAtual +
                "\n, aberto=" + aberto +
                "\n, leitor=" + leitor.getNome() +
                "\n idade =" + leitor.getIdade() +
                "\n sexo=" + leitor.getSexo () +
                '}';
    }

    //METODO CONSTRUTOR
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;

    }


    private void setTitulo(String titulo){
        this.titulo = titulo;
    }
    private String getTitulo(){
        return this.titulo;
    }
    private void setAutor(String autor){
        this.autor = autor;
    }
    private String getAutor(){
        return this.autor;
    }
    private void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }
    private int getTotPaginas(){
        return this.totPaginas;
    }
    private void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    private int getPagAtual(){
        return this.pagAtual;
    }
    private void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    private boolean getAberto(){
        return this.aberto;
    }
    private void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }
    private Pessoa getLeitor(){
        return this.leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;

    }

    @Override
    public void avancarPag() {
        this.pagAtual++;

    }

    @Override
    public void voltarPag() {
        this.pagAtual--;

    }
}


