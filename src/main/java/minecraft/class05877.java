package minecraft;

public interface class05877<T extends class07482, U extends class05096 & class05868<T>> {
   U create(T var1, class08044 var2, class00392 var3);

   default void N(class00392 var1, class05851<T> var2, class06202 var3, int var4) {
      class05096 class05096 = this.create((T)var2.method_17434(var4, ((class04453)var3.T_4).method_31548()), ((class04453)var3.T_4).method_31548(), var1);
      ((class04453)var3.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = ((class05868)class05096).E();
      var3.N(class05096);
   }
}
