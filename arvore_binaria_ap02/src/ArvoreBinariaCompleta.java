public class ArvoreBinariaCompleta {

        // 1. DEFINIÇÃO DO NÓ (CLASSE ANINHADA)
        /**
         * Define a estrutura básica de um nó da Árvore Binária.
         * Sendo 'static', ela pode ser acessada sem uma instância da classe externa.
         */
        static class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode(int val) {
                this.val = val;
                this.left = null;
                this.right = null;
            }

            @Override
            public String toString() {
                return "Node(" + val + ")";
            }
        }

        // 2. ALGORITMO DE RECONSTRUÇÃO

        // Este índice precisa ser um campo da classe (ou passado por referência)
        // para que seu valor seja mantido através das chamadas recursivas.
        private int preIndex = 0;

        /**
         * Método público principal que inicia a construção da árvore.
         * @param preorder O array contendo a travessia em pré-ordem.
         * @return A raiz (TreeNode) da árvore reconstruída.
         */
        public TreeNode buildBstFromPreorder(int[] preorder) {
            if (preorder == null || preorder.length == 0) {
                return null;
            }
            // Reseta o índice para o início
            this.preIndex = 0;

            // Chama o método recursivo "helper" com os limites iniciais
            return buildHelper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        /**
         * Método recursivo auxiliar (helper) que constrói a árvore.
         * @param preorder O array de pré-ordem.
         * @param min O valor mínimo que um nó nesta sub-árvore pode ter.
         * @param max O valor máximo que um nó nesta sub-árvore pode ter.
         * @return O nó raiz da sub-árvore construída.
         */
        private TreeNode buildHelper(int[] preorder, int min, int max) {

            // Caso Base: Se o índice saiu dos limites do array
            if (preIndex >= preorder.length) {
                return null;
            }

            int currentVal = preorder[preIndex];

            // Se o valor atual não está nos limites [min, max],
            // ele pertence a outra sub-árvore (ex: é filho direito de um nó pai).
            if (currentVal < min || currentVal > max) {
                return null;
            }

            // O valor é válido, criamos o nó
            TreeNode node = new TreeNode(currentVal);

            // Avançamos o índice global
            preIndex++;

            // Construímos a sub-árvore esquerda (limite superior é o valor do nó atual)
            node.left = buildHelper(preorder, min, currentVal);

            // Construímos a sub-árvore direita (limite inferior é o valor do nó atual)
            node.right = buildHelper(preorder, currentVal, max);

            return node;
        }

        // 3. MÉTODOS DE TRAVESSIA (TRAVERSAL)
        // (Feitos como 'static' pois são funções utilitárias puras)

        /**
         * Imprime a árvore em PRÉ-ORDEM (Raiz, Esquerda, Direita).
         */
        public static void printPreOrder(TreeNode node) {
            if (node == null) {
                return;
            }
            System.out.print(node.val + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }

        /**
         * Imprime a árvore EM-ORDEM (Esquerda, Raiz, Direita).
         */
        public static void printInOrder(TreeNode node) {
            if (node == null) {
                return;
            }
            printInOrder(node.left);
            System.out.print(node.val + " ");
            printInOrder(node.right);
        }

        /**
         * Imprime a árvore em PÓS-ORDEM (Esquerda, Direita, Raiz).
         */
        public static void printPostOrder(TreeNode node) {
            if (node == null) {
                return;
            }
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.val + " ");
        }
}
