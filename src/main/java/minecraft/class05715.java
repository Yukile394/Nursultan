package minecraft;

import Nursultan.class10535;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Set;

public enum class05715 {
   field_19212(class06962.N),
   field_59995(class06962.y),
   field_19213(class06962.L),
   field_19214(class06962.u),
   field_19215(class06962.i),
   field_19216(class06962.R),
   field_19217(class06962.M),
   field_19218(class06962.B),
   field_45077(class06962.Z),
   field_45078(class06962.z),
   field_45079(class06962.U),
   field_45080(class06962.E),
   field_45081(class06962.W),
   field_45082(class06962.m),
   field_45083(class06962.P),
   field_63265(class06962.s),
   field_45084(class06962.T),
   field_62507(class06962.b),
   field_19220(class06962.j),
   field_19221(class06962.v),
   field_24640(class06962.A),
   field_26990(class06962.n),
   field_63266(class06962.t);

   public static final Set<TypeReference> field_42975;
   private final TypeReference field_19222;

   private class05715(TypeReference var3) {
      this.field_19222 = var3;
   }

   public class07001 N(DataFixer var1, class07001 var2, int var3) {
      return this.N(var1, var2, var3, N());
   }

   public class07001 N(DataFixer var1, class07001 var2, int var3, int var4) {
      return (class07001)this.N(var1, new Dynamic(class07713.N, var2), var3, var4).getValue();
   }

   public <T> Dynamic<T> N(DataFixer var1, Dynamic<T> var2, int var3, int var4) {
      return var1.update(this.field_19222, var2, var3, var4);
   }

   public <T> Dynamic<T> N(DataFixer var1, Dynamic<T> var2, int var3) {
      return this.N(var1, var2, var3, N());
   }

   public <A> Codec<A> N(Codec<A> var1, DataFixer var2, int var3) {
      return new class10535<>(this, var1, var3, var2);
   }

   public static int N() {
      return class07529.y().comp_4026().y();
   }

   static {
      field_42975 = Set.of(field_59995.field_19222);
   }
}
