package minecraft;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public final class class06625 extends class06599 {
   private static final String B = "persistent";
   private static final String Z = "decayable";
   private static final String z = "distance";
   @Nullable
   private IntSet U;
   @Nullable
   private IntSet E;
   @Nullable
   private Int2IntMap W;

   int L(int var1) {
      return this.N(var1) ? 0 : Integer.parseInt(this.i.get(var1).get("Properties").get("distance").asString(""));
   }

   public class06625(Typed<?> var1, Schema var2) {
      super(var1, var2);
   }

   public boolean y(int var1) {
      return this.U.contains(var1);
   }

   void N(int var1, int var2, int var3) {
      Dynamic<?> dynamic = this.i.get(var2);
      String s = dynamic.get("Name").asString("");
      boolean flag = Objects.equals(dynamic.get("Properties").get("persistent").asString(""), "true");
      int i = this.N(s, flag, var3);
      if (!this.W.containsKey(i)) {
         int j = this.i.size();
         this.U.add(j);
         this.W.put(i, j);
         this.i.add(this.N(dynamic, s, flag, var3));
      }

      int l = this.W.get(i);
      if (1 << this.M.y() <= l) {
         class05945 class05945 = new class05945(this.M.y() + 1, 4096);

         for (int k = 0; k < 4096; k++) {
            class05945.N(k, this.M.N(k));
         }

         this.M = class05945;
      }

      this.M.N(var1, l);
   }

   public boolean N(int var1) {
      return this.E.contains(var1);
   }

   private Dynamic<?> N(Dynamic<?> var1, String var2, boolean var3, int var4) {
      Dynamic dynamic = var1.emptyMap();
      dynamic = dynamic.set("persistent", dynamic.createString(var3 ? "true" : "false"));
      dynamic = dynamic.set("distance", dynamic.createString(Integer.toString(var4)));
      Dynamic dynamic1 = var1.emptyMap();
      dynamic1 = dynamic1.set("Properties", dynamic);
      return dynamic1.set("Name", dynamic1.createString(var2));
   }

   @Override
   protected boolean N() {
      this.U = new IntOpenHashSet();
      this.E = new IntOpenHashSet();
      this.W = new Int2IntOpenHashMap();

      for (int i = 0; i < this.i.size(); i++) {
         Dynamic<?> dynamic = this.i.get(i);
         String s = dynamic.get("Name").asString("");
         if (class06616.N.containsKey(s)) {
            boolean flag = Objects.equals(dynamic.get("Properties").get("decayable").asString(""), "false");
            this.U.add(i);
            this.W.put(this.N(s, flag, 7), i);
            this.i.set(i, this.N(dynamic, s, flag, 7));
         }

         if (class06616.y.contains(s)) {
            this.E.add(i);
         }
      }

      return this.U.isEmpty() && this.E.isEmpty();
   }
}
