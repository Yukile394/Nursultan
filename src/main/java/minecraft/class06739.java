package minecraft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class class06739 implements class06728 {
   private final List<class06748> L = new ArrayList<>();
   private final List<class06748> u = new ArrayList<>();

   public class06739() {
      super();
   }

   public List<class06748> y() {
      return this.L;
   }

   public void N(Collection<class06748> var1) {
      this.u.addAll(var1);
   }

   public List<class06748> N() {
      ArrayList arraylist = new ArrayList<>(this.L);
      arraylist.addAll(this.u);
      long i = class07536.L();
      this.L.removeIf(var2x -> var2x.u() < i);
      this.u.clear();
      return arraylist;
   }

   @Override
   public class06723 method_75532(class06730 var1) {
      class06748 class06748 = new class06748(var1);
      this.L.add(class06748);
      return class06748;
   }
}
