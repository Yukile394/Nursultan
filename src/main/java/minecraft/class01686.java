package minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.client.rendering.ModelPartAccessor;
import org.joml.Matrix3f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;

@Environment(EnvType.CLIENT)
public final class class01686 implements ModelPartAccessor {
   public static final float N = 1.0F;
   public float y;
   public float L;
   public float u;
   public float i;
   public float R;
   public float M;
   public float B = 1.0F;
   public float Z = 1.0F;
   public float z = 1.0F;
   public boolean U = true;
   public boolean E;
   public final List<class01687> W;
   private final Map<String, class01686> m;
   private class04838 P = class04838.N;

   public void L() {
      this.y(this.P);
   }

   public void L(Vector3f var1) {
      this.B = this.B + var1.x();
      this.Z = this.Z + var1.y();
      this.z = this.z + var1.z();
   }

   public class01686(List<class01687> var1, Map<String, class01686> var2) {
      super();
      this.W = var1;
      this.m = var2;
   }

   public List<class01686> i() {
      ArrayList arraylist = new ArrayList();
      arraylist.add(this);
      this.N((BiConsumer<String, class01686>)((var1x, var2) -> arraylist.add(var2)));
      return List.copyOf(arraylist);
   }

   public boolean u() {
      return this.W.isEmpty();
   }

   public class01686 y(String var1) {
      class01686 class01686 = this.m.get(var1);
      if (class01686 == null) {
         throw new NoSuchElementException("Can't find part " + var1);
      } else {
         return class01686;
      }
   }

   public void y(Vector3f var1) {
      this.i = this.i + var1.x();
      this.R = this.R + var1.y();
      this.M = this.M + var1.z();
   }

   public void y(float var1, float var2, float var3) {
      this.i = var1;
      this.R = var2;
      this.M = var3;
   }

   public class04838 y() {
      return this.P;
   }

   public void y(class04838 var1) {
      this.y = var1.N();
      this.L = var1.y();
      this.u = var1.L();
      this.i = var1.u();
      this.R = var1.i();
      this.M = var1.R();
      this.B = var1.M();
      this.Z = var1.B();
      this.z = var1.Z();
   }

   public void N(Vector3f var1) {
      this.y = this.y + var1.x();
      this.L = this.L + var1.y();
      this.u = this.u + var1.z();
   }

   public class01687 N(class06069 var1) {
      return this.W.get(var1.y(this.W.size()));
   }

   public void N(class01421 var1) {
      if (this.y != 0.0F || this.L != 0.0F || this.u != 0.0F) {
         var1.N(this.y * 0.0625F, this.L * 0.0625F, this.u * 0.0625F);
      }

      if (this.i != 0.0F || this.R != 0.0F || this.M != 0.0F) {
         MatrixHelper.rotateZYX(var1.L(), this.M, this.R, this.i);
      }

      if (this.B != 1.0F || this.Z != 1.0F || this.z != 1.0F) {
         var1.y(this.B, this.Z, this.z);
      }
   }

   private void N(BiConsumer<String, class01686> var1) {
      for (Entry entry : this.m.entrySet()) {
         var1.accept((String)entry.getKey(), (class01686)entry.getValue());
      }

      for (class01686 class01686 : this.m.values()) {
         class01686.N(var1);
      }
   }

   public void N(class01421 var1, class01391 var2, int var3, int var4, int var5) {
      if (this.U) {
         if (!this.W.isEmpty() || !this.m.isEmpty()) {
            var1.N();
            this.N(var1);
            if (!this.E) {
               this.N(var1.L(), var2, var3, var4, var5);
            }

            Iterator<class01686> iterator = this.m.values().iterator();

            while (iterator.hasNext()) {
               iterator.next().N(var1, var2, var3, var4, var5);
            }

            var1.y();
         }
      }
   }

   public class04838 N() {
      return class04838.N(this.y, this.L, this.u, this.i, this.R, this.M);
   }

   public void N(class01421 var1, class01391 var2, int var3, int var4) {
      this.N(var1, var2, var3, var4, -1);
   }

   public void N(float var1, float var2, float var3) {
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   public boolean N(String var1) {
      return this.m.containsKey(var1);
   }

   public void N(class04838 var1) {
      this.P = var1;
   }

   private void N(class01423 var1, class01391 var2, int var3, int var4, int var5) {
      Iterator<class01687> iterator = this.W.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var1, var2, var3, var4, var5);
      }
   }

   private void N(class01421 var1, class01689 var2, String var3) {
      if (!this.W.isEmpty() || !this.m.isEmpty()) {
         var1.N();
         this.N(var1);
         class01423 class01423 = var1.L();

         for (int ix = 0; ix < this.W.size(); ix++) {
            var2.method_35748(class01423, var3, ix, this.W.get(ix));
         }

         String s = var3 + "/";
         this.m.forEach((var3x, var4x) -> var4x.N(var1, var2, s + var3x));
         var1.y();
      }
   }

   public void N(class01421 var1, class01689 var2) {
      this.N(var1, var2, "");
   }

   public void N(class01421 var1, Consumer<Vector3fc> var2) {
      this.N(var1, (var1x, var2x, var3, var4) -> {
         class01706[] aclass01706 = var4.N;
         int ix = aclass01706.length;

         for (int j = 0; j < ix; j++) {
            for (class01699 class01699 : aclass01706[j].N()) {
               float f = class01699.N();
               float f1 = class01699.y();
               float f2 = class01699.L();
               Vector3f vector3f = var1x.N().transformPosition(f, f1, f2, new Vector3f());
               var2.accept(vector3f);
            }
         }
      });
   }

   public void N(Quaternionf var1) {
      Vector3f vector3f = new Matrix3f().rotationZYX(this.M, this.R, this.i).rotate(var1).getEulerAnglesZYX(new Vector3f());
      this.y(vector3f.x, vector3f.y, vector3f.z);
   }

   public Function<String, class01686> R() {
      HashMap hashmap = new HashMap();
      hashmap.put("root", this);
      this.N(hashmap::putIfAbsent);
      return hashmap::get;
   }
}
