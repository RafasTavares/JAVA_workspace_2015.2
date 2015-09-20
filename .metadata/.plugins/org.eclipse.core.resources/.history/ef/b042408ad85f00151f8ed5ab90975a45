package br.com.arvoreBinariaDeBusca;

import static org.junit.Assert.*;

import org.junit.Test;

public class teste {

	@Test
	public void test() {
	ArvoreBinariaBuscaNova<Integer> tree = new ArvoreBinariaBuscaNova<Integer>();
	
	tree.inserir(1);
	tree.inserir(2);
	tree.inserir(3);
	tree.inserir(4);
	tree.inserir(5);
	System.out.println("Largura: " + tree.obterTodosEmLargura());
	System.out.println("Ordem Raiz: " + tree.obterTodosEmOrdem(tree.getpai()));
	System.out.println("Pos Ordem: " + tree.obterTodosPosOrdem(tree.getPai()));
	System.out.println("Pre Ordem: " + tree.obterTodosPreOrdem(tree.getpai()));
	tree.remover(3);
	System.out.println(":::::::::::::::::::: REMOVENDO 3 ::::::::::::::::::::::");
	System.out.println("Largura: " + tree.obterTodosEmLargura());
	
	}
	@Test
	public void test1() {
	ArvoreBinariaBuscaNova<Integer> tree = new ArvoreBinariaBuscaNova<Integer>();
	tree.inserir(1);
	tree.inserir(2);
	tree.inserir(3);
	tree.inserir(4);
	tree.inserir(5);
	System.out.println("Calcular nivel: " + tree.calcularNivelNodo(3));
	System.out.println("Pesquisar: " + tree.pesquisarIterativo(1));
	}
}
