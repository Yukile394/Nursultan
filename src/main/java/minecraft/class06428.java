package minecraft;

import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import jerozgen.languagereload.mixin.KeyBindingAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.client.keybinding.KeyMappingAccessor;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class06428
   implements Comparable<class06428>,
   KeyBindingAccessor,
   KeyMappingAccessor,
   net.fabricmc.fabric.mixin.event.interaction.client.KeyMappingAccessor {
   private static final Map<String, class06428> y = Maps.newHashMap();
   private static final Map<class04671, List<class06428>> L = Maps.newHashMap();
   private final String u;
   private final class04671 i;
   private final class06384 R;
   public class04671 N;
   private boolean M;
   private int B;
   private final int Z;

   private void L(class04671 var1) {
      L.computeIfAbsent(var1, var0 -> new ArrayList<>()).add(this);
   }

   public static void L() {
      for (class06428 class06428 : y.values()) {
         if (class06428 instanceof class05926 class05926 && class05926.T()) {
            class05926.N(true);
         }
      }
   }

   public class06384 M() {
      return this.R;
   }

   public boolean P() {
      return this.N.equals(this.i);
   }

   public class06428(String var1, class04648 var2, int var3, class06384 var4) {
      this(var1, var2, var3, var4, 0);
   }

   public class06428(String var1, class04648 var2, int var3, class06384 var4, int var5) {
      super();
      this.u = var1;
      this.N = var2.N(var3);
      this.i = this.N;
      this.R = var4;
      this.Z = var5;
      y.put(var1, this);
      this.L(this.N);
   }

   public class06428(String var1, int var2, class06384 var3) {
      this(var1, class04648.field_1668, var2, var3);
   }

   public boolean B() {
      if (this.B == 0) {
         return false;
      } else {
         this.B--;
         return true;
      }
   }

   protected void Z() {
      this.B = 0;
      this.N(false);
   }

   public static void i() {
      L.clear();

      for (class06428 class06428 : y.values()) {
         class06428.L(class06428.N);
      }
   }

   public String s() {
      return this.N.L();
   }

   public class00392 m() {
      return this.N.u();
   }

   public String U() {
      return this.u;
   }

   protected boolean z() {
      return this.N.N() == class04648.field_1668 && this.N.y() != class04655.yI.y();
   }

   public static void u() {
      for (class06428 class06428 : y.values()) {
         if (class06428 instanceof class05926) {
            ((class05926)class06428).b();
         }
      }
   }

   public boolean y(class06428 var1) {
      return this.N.equals(var1.N);
   }

   public void y(class04671 var1) {
      this.N = var1;
   }

   public static void y() {
      Iterator<class06428> iterator = y.values().iterator();

      while (iterator.hasNext()) {
         iterator.next().Z();
      }
   }

   @Nullable
   public static class06428 y(String var0) {
      return y.get(var0);
   }

   public class04671 E() {
      return this.i;
   }

   public void N(boolean var1) {
      this.M = var1;
   }

   public int compareTo(class06428 var1) {
      if (this.R == var1.R) {
         return this.Z == var1.Z ? class08392.N(this.u).compareTo(class08392.N(var1.u)) : Integer.compare(this.Z, var1.Z);
      } else {
         return Integer.compare(class06384.N.indexOf(this.R), class06384.N.indexOf(var1.R));
      }
   }

   public static void N() {
      class08844 class08844 = class06202.Nq().Nt();

      for (class06428 class06428 : y.values()) {
         if (class06428.z()) {
            class06428.N(class04655.N(class08844, class06428.N.y()));
         }
      }
   }

   private static void N(class04671 var0, Consumer<class06428> var1) {
      List<class06428> list = L.get(var0);
      if (list != null && !list.isEmpty()) {
         for (class06428 class06428 : list) {
            var1.accept(class06428);
         }
      }
   }

   public static void N(class04671 var0, boolean var1) {
      N(var0, var1x -> var1x.N(var1));
   }

   public static void N(class04671 var0) {
      N(var0, var0x -> var0x.B++);
   }

   public boolean N(class06613 var1) {
      return this.N.N() == class04648.field_1672 && this.N.y() == var1.v();
   }

   public static Supplier<class00392> N(String var0) {
      class06428 class06428 = y.get(var0);
      return class06428 == null ? () -> class00392.L(var0) : class06428::m;
   }

   public boolean N(class06601 var1) {
      return var1.v() == class04655.yI.y()
         ? this.N.N() == class04648.field_1671 && this.N.y() == var1.n()
         : this.N.N() == class04648.field_1668 && this.N.y() == var1.v();
   }

   public boolean W() {
      return this.N.equals(class04655.yI);
   }

   public boolean R() {
      return this.M;
   }
}
