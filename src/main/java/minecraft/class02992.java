package minecraft;

import java.util.Map;

public record class02992<T>(class02965<T> data, class07099<T> registry, Map<class05946<?>, Exception> loadingErrors) {

   public Map<class05946<?>, Exception> L() {
      return this.loadingErrors;
   }

   public class02992(class02965<T> data, class07099<T> registry, Map<class05946<?>, Exception> loadingErrors) {
      super();
      this.data = data;
      this.registry = registry;
      this.loadingErrors = loadingErrors;
   }

   public class07099<T> y() {
      return this.registry;
   }

   public void N(Map<class05946<? extends class00751<?>>, class02982> var1, class02857 var2, class03542 var3) {
      class03078.N(var1, var2, var3, this.registry, this.data.y(), this.loadingErrors);
   }

   public void N(class01089 var1, class03542 var2) {
      class03078.N(var1, var2, this.registry, this.data.y(), this.loadingErrors);
   }

   public class02965<T> N() {
      return this.data;
   }
}
