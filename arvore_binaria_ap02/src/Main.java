public static void Main(String[] args) {
        // Meu RA: 2403403
        // Sequência de pré-ordem do meu RA: 2043

    }

void main() {
        int[] preorder = {2, 0, 4, 3};

        System.out.println("Array de entrada (Pré-Ordem): [2, 0, 4, 3]");
        System.out.println("---");

        // Precisamos instanciar a classe principal para poder chamar
        // os métodos de reconstrução (pois eles usam o campo 'preIndex')
        ArvoreBinariaCompleta construtor = new ArvoreBinariaCompleta();
        ArvoreBinariaCompleta.TreeNode raiz = construtor.buildBstFromPreorder(preorder);

        System.out.println("Árvore reconstruída com sucesso. Raiz: " + (raiz != null ? raiz.val : "null"));
        System.out.println("---");

        // Os métodos de impressão podem ser chamados diretamente (são estáticos)
        System.out.println("1. Travessia em PRÉ-ORDEM (Raiz, Esq, Dir):");
        ArvoreBinariaCompleta.printPreOrder(raiz);

        System.out.println("\n\n2. Travessia EM-ORDEM (Esq, Raiz, Dir):");
        ArvoreBinariaCompleta.printInOrder(raiz);

        System.out.println("\n\n3. Travessia em PÓS-ORDEM (Esq, Dir, Raiz):");
        ArvoreBinariaCompleta.printPostOrder(raiz);
}
