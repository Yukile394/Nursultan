package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class class04912 extends class04919 {
   public static final String y = "recipeBook";
   private static final Logger i = LogUtils.getLogger();
   private final class04915 R;
   protected final Set<class05946<class06521<?>>> L = Sets.newIdentityHashSet();
   protected final Set<class05946<class06521<?>>> u = Sets.newIdentityHashSet();

   public void L(class05946<class06521<?>> var1) {
      this.L.remove(var1);
      this.u.remove(var1);
   }

   public class04912(class04915 var1) {
      super();
      this.R = var1;
   }

   private void i(class05946<class06521<?>> var1) {
      this.u.add(var1);
   }

   public void u(class05946<class06521<?>> var1) {
      this.u.remove(var1);
   }

   public int y(Collection<class03729<?>> var1, class04770 var2) {
      ArrayList arraylist = Lists.newArrayList();
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         class05946<class06521<?>> class05946 = ((class03729)iterator.next()).N();
         if (this.L.contains(class05946)) {
            this.L(class05946);
            this.R.displaysForRecipe(class05946, var1x -> arraylist.add(var1x.N()));
         }
      }

      if (!arraylist.isEmpty()) {
         var2.field_13987.method_14364(new class00257(arraylist));
      }

      return arraylist.size();
   }

   public boolean y(class05946<class06521<?>> var1) {
      return this.L.contains(var1);
   }

   public void N(class04930 var1, Predicate<class05946<class06521<?>>> var2) {
      this.N.N(var1.N());
      this.N(var1.y(), this.L::add, var2);
      this.N(var1.L(), this.u::add, var2);
   }

   private void N(class04930 var1) {
      this.L.clear();
      this.u.clear();
      this.N.N(var1.N());
      this.L.addAll(var1.y());
      this.u.addAll(var1.L());
   }

   public void N(class04770 var1) {
      var1.field_13987.method_14364(new class00251(this.u().N()));
      ArrayList arraylist = new ArrayList(this.L.size());

      for (class05946<class06521<?>> class05946 : this.L) {
         this.R.displaysForRecipe(class05946, var3 -> arraylist.add(new class00268(var3, false, this.u.contains(class05946))));
      }

      var1.field_13987.method_14364(new class00278(arraylist, true));
   }

   public int N(Collection<class03729<?>> var1, class04770 var2) {
      ArrayList arraylist = new ArrayList();

      for (class03729 class03729 : var1) {
         class05946<class06521<?>> class05946 = class03729.N();
         if (!this.L.contains(class05946) && !class03729.y().method_8118()) {
            this.N(class05946);
            this.i(class05946);
            this.R.displaysForRecipe(class05946, var2x -> arraylist.add(new class00268(var2x, class03729.y().L(), true)));
            class06912.M.N(var2, class03729);
         }
      }

      if (!arraylist.isEmpty()) {
         var2.field_13987.method_14364(new class00278(arraylist, false));
      }

      return arraylist.size();
   }

   private void N(List<class05946<class06521<?>>> var1, Consumer<class05946<class06521<?>>> var2, Predicate<class05946<class06521<?>>> var3) {
      for (class05946 class05946 : var1) {
         if (!var3.test(class05946)) {
            i.error("Tried to load unrecognized recipe: {} removed now.", class05946);
         } else {
            var2.accept(class05946);
         }
      }
   }

   public void N(class05946<class06521<?>> var1) {
      this.L.add(var1);
   }

   public void N(class04912 var1) {
      this.N(var1.N());
   }

   public class04930 N() {
      return new class04930(this.N.N(), List.copyOf(this.L), List.copyOf(this.u));
   }
}
