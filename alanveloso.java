Desafio 1

class Tarefa {
    constructor(titulo, descricao, prazo, prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    setTitulo(novoTitulo) {
        this.titulo = novoTitulo;
    }

    getTitulo() {
        return this.titulo;
    }
}

// Criando uma instância da classe Tarefa
let minhaTarefa = new Tarefa("Estudar JavaScript", "Completar os exercícios do capítulo 3", "2024-09-01", "Alta");

// Modificando o título da tarefa
minhaTarefa.setTitulo("Estudar JavaScript Avançado");

// Exibindo o novo título
console.log(minhaTarefa.getTitulo()); // Saída: Estudar JavaScript Avançado


Desafio 2

class Tarefa {
    constructor(titulo, descricao, prazo, prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    setTitulo(novoTitulo) {
        this.titulo = novoTitulo;
    }

    getTitulo() {
        return this.titulo;
    }

    exibirDetalhes() {
        console.log(`Título: ${this.titulo}`);
        console.log(`Descrição: ${this.descricao}`);
        console.log(`Prazo: ${this.prazo}`);
        console.log(`Prioridade: ${this.prioridade}`);
    }
}

// Criando uma instância da classe Tarefa
let minhaTarefa = new Tarefa("Estudar JavaScript", "Completar os exercícios do capítulo 5", "2024-09-01", "Alta");

// Exibindo os detalhes da tarefa
minhaTarefa.exibirDetalhes();

Desafio 3

class Categoria {
    constructor(nome) {
        this.nome = nome;
    }

    setNome(novoNome) {
        this.nome = novoNome;
    }

    getNome() {
        return this.nome;
    }
}

class Tarefa {
    constructor(titulo, descricao, prazo, prioridade, categoria = null) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
        this.categoria = categoria;
    }

    setTitulo(novoTitulo) {
        this.titulo = novoTitulo;
    }

    getTitulo() {
        return this.titulo;
    }

    setCategoria(categoria) {
        this.categoria = categoria;
    }

    getCategoria() {
        return this.categoria;
    }

    exibirDetalhes() {
        console.log(`Título: ${this.titulo}`);
        console.log(`Descrição: ${this.descricao}`);
        console.log(`Prazo: ${this.prazo}`);
        console.log(`Prioridade: ${this.prioridade}`);
        if (this.categoria) {
            console.log(`Categoria: ${this.categoria.getNome()}`);
        }
    }
}

// Criando uma instância da classe Categoria
let minhaCategoria = new Categoria("Estudos");

// Criando uma instância da classe Tarefa e associando uma categoria
let minhaTarefa = new Tarefa("Estudar JavaScript", "Completar os exercícios do capítulo 5", "2024-09-01", "Alta", minhaCategoria);

// Exibindo os detalhes da tarefa com a categoria
minhaTarefa.exibirDetalhes();

