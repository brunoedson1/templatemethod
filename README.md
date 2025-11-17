# 🧩 Padrão Template Method – Relatório Financeiro

Este projeto demonstra o uso do **padrão comportamental Template Method** no contexto de geração de **relatórios financeiros**.  
O Template Method permite definir o **esqueleto fixo** de um processo em uma classe abstrata, enquanto delega para subclasses as variações específicas de cada etapa.

> 🔍 Ideal quando vários relatórios seguem a mesma estrutura geral, mas mudam no conteúdo, cabeçalho ou formatação.

---

## 📘 O que é o Template Method?

O **Template Method** é um padrão comportamental que:

- Define **o fluxo completo** de um algoritmo em um método final (template method).  
- Permite que **partes específicas** do processo sejam implementadas pelas subclasses.  
- Garante que **a ordem das etapas permaneça fixa**, mesmo quando o conteúdo varia.

Esse padrão organiza o código, **evita duplicação**, e controla rigorosamente a sequência do processo — perfeito para relatórios padronizados.

---

## 🧱 Estrutura do Padrão

### 🔸 **Classe Abstrata (Template) – RelatorioFinanceiroTemplate**
Define:
- O **template method** (geralmente `final`)
- Métodos abstratos ou hooks implementados pelas subclasses

### 🔸 **Template Method**
Método principal que define a sequência fixa do algoritmo.  
No nosso caso: **gerarRelatorio()**

### 🔸 **Métodos Abstratos / Hooks**
Passos que as subclasses devem implementar:
- `cabecalho()`
- `conteudo()`
- `rodape()`

### 🔸 **Subclasses Concretas**
Implementam as etapas específicas, por exemplo:
- `RelatorioFinanceiroSimples`
- `RelatorioFinanceiroDetalhado`
- `RelatorioFinanceiroOperacional`
