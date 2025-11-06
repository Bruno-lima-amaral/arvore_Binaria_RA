# 🌳 Reconstrução de Árvore Binária de Busca (BST)

Este projeto em Java demonstra como reconstruir uma Árvore Binária de Busca (BST) completa utilizando apenas sua sequência de travessia em **pré-ordem**.

Após a reconstrução da árvore, o programa exibe as três principais formas de travessia:
1.  **Pré-Ordem** (Raiz, Esquerda, Direita)
2.  **Em-Ordem** (Esquerda, Raiz, Direita)
3.  **Pós-Ordem** (Esquerda, Direita, Raiz)

---

## 📋 Contexto do Problema

O algoritmo foi desenvolvido para resolver um caso de uso específico baseado no RA (Registro Acadêmico) `2403403`.

1.  **RA:** `2403403`
2.  **Dígitos únicos (na ordem de aparição):** `2`, `4`, `0`, `3`
3.  **Sequência de Pré-Ordem de entrada:** `[2, 0, 4, 3]`

A lógica assume que esta sequência de pré-ordem (`[2, 0, 4, 3]`) é usada para construir uma Árvore Binária de Busca (BST). O algoritmo no arquivo `ArvoreBinariaCompleta.java` reconstrói a seguinte estrutura de árvore:
