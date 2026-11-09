package minecraft;

import com.google.common.collect.ImmutableList;

public record class02238(ImmutableList<class02237> steps) {
   public static final class02238 N = new class02230()
      .N(class00549.L, $$0 -> $$0)
      .N(class00549.u, $$0 -> $$0.N(class02696::y))
      .N(class00549.i, var0 -> var0.N(class00549.u, 8).N(class02696::u))
      .N(class00549.R, var0 -> var0.N(class00549.u, 8).N(class02696::i))
      .N(class00549.M, var0 -> var0.N(class00549.u, 8).N(class00549.R, 1).N(0).N(class02696::R))
      .N(class00549.B, var0 -> var0.N(class00549.u, 8).N(class00549.R, 1).N(0).N(class02696::M))
      .N(class00549.Z, var0 -> var0.N(class00549.u, 8).N(0).N(class02696::B))
      .N(class00549.z, var0 -> var0.N(class00549.u, 8).N(class00549.Z, 1).N(1).N(class02696::Z))
      .N(class00549.U, $$0 -> $$0.N(class02696::z))
      .N(class00549.E, $$0 -> $$0.N(class00549.U, 1).N(class02696::U))
      .N(class00549.W, var0 -> var0.N(class00549.R, 1).N(class02696::E))
      .N(class00549.m, var0 -> var0.N(class02696::W))
      .N();
   public static final class02238 y = new class02230()
      .N(class00549.L, var0 -> var0)
      .N(class00549.u, $$0 -> $$0.N(class02696::L))
      .N(class00549.i, var0 -> var0)
      .N(class00549.R, var0 -> var0)
      .N(class00549.M, $$0 -> $$0)
      .N(class00549.B, $$0 -> $$0)
      .N(class00549.Z, $$0 -> $$0)
      .N(class00549.z, $$0 -> $$0)
      .N(class00549.U, $$0 -> $$0.N(class02696::z))
      .N(class00549.E, $$0 -> $$0.N(class00549.U, 1).N(class02696::U))
      .N(class00549.W, var0 -> var0)
      .N(class00549.m, var0 -> var0.N(class02696::W))
      .N();

   public class02238(ImmutableList<class02237> steps) {
      this.steps = steps;
   }

   public ImmutableList<class02237> N() {
      return this.steps;
   }

   public class02237 N(class00549 var1) {
      return (class02237)this.steps.get(var1.y());
   }
}
