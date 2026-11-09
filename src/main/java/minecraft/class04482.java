package minecraft;

import com.google.common.collect.HashMultimap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class class04482 implements class04490 {
   public static final class04489 y = () -> "";
   @Nullable
   private final class04482 L;
   private final class04489 u;
   private final Set<class04497> i;

   public String L() {
      ArrayList arraylist = new ArrayList();
      class04510 class04510x = new class04510(this.u);

      for (class04497 class04497 : this.i) {
         for (class04482 class04482 = class04497.N(); class04482 != this; class04482 = class04482.L) {
            arraylist.add(class04482.u);
         }

         class04510 class04510x = class04510x;

         for (int ix = arraylist.size() - 1; ix >= 0; ix--) {
            class04510x = class04510x.N((class04489)arraylist.get(ix));
         }

         arraylist.clear();
         class04510x.L().add(class04497.y());
      }

      return String.join("\n", class04510x.N());
   }

   private class04482(class04482 var1, class04489 var2) {
      super();
      this.i = var1.i;
      this.L = var1;
      this.u = var2;
   }

   public class04482(class04489 var1) {
      super();
      this.L = null;
      this.i = new LinkedHashSet<>();
      this.u = var1;
   }

   public class04482() {
      this(y);
   }

   public String y() {
      HashMultimap hashmultimap = HashMultimap.create();
      this.N(hashmultimap::put);
      return hashmultimap.asMap()
         .entrySet()
         .stream()
         .map(var0 -> " at " + (String)var0.getKey() + ": " + ((Collection)var0.getValue()).stream().map(class04480::N).collect(Collectors.joining("; ")))
         .collect(Collectors.joining("\n"));
   }

   public void N(BiConsumer<String, class04480> var1) {
      ArrayList arraylist = new ArrayList();
      StringBuilder stringbuilder = new StringBuilder();

      for (class04497 class04497 : this.i) {
         for (class04482 class04482 = class04497.N(); class04482 != null; class04482 = class04482.L) {
            arraylist.add(class04482.u);
         }

         for (int ix = arraylist.size() - 1; ix >= 0; ix--) {
            stringbuilder.append(((class04489)arraylist.get(ix)).get());
         }

         var1.accept(stringbuilder.toString(), class04497.y());
         stringbuilder.setLength(0);
         arraylist.clear();
      }
   }

   @Override
   public class04490 N_46(class04489 var1) {
      return new class04482(this, var1);
   }

   @Override
   public void N_47(class04480 var1) {
      this.i.add(new class04497(this, var1));
   }

   public boolean N() {
      return this.i.isEmpty();
   }
}
