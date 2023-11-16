import arvoreInt.ArvoreInt;

public class Ex01 {
    public static void main(String[] args) throws Exception {
       int[] vet = {30, 15, 60, 20, 10, 40, 80};
       ArvoreInt arvore = new ArvoreInt();
       for(int i : vet){
        arvore.insert(i);
       }

       try{
        System.out.println("Atravessamento pré-ordem:");
        arvore.prefixSearch();
        System.out.println("====================================================");
        System.out.println("Atravessamento em ordem (apresenta os dados emo ordem crescente.):");
        arvore.infixSearch();
        System.out.println("====================================================");
        System.out.println("Atravessamento pós-ordem:");
        arvore.postfixSearch();
        System.out.println("====================================================");
        arvore.remove(60);
        System.out.println("Atravessamento em ordem (Sem o 60):");
        arvore.infixSearch();
       } catch(Exception e){
            System.err.println(e.getMessage());
       }

    }
}
