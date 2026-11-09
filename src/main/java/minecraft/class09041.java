package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class09041(float start, float end, Optional<Float> initial, Optional<Float> step) {
   public static final MapCodec<class09041> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               Codec.FLOAT.fieldOf("start").forGetter(class09041::y),
               Codec.FLOAT.fieldOf("end").forGetter(class09041::L),
               Codec.FLOAT.optionalFieldOf("initial").forGetter(class09041::u),
               class06338.t.optionalFieldOf("step").forGetter(class09041::i)
            )
            .apply(var0, class09041::new)
      )
      .validate(var0 -> {
         if (var0.initial.isPresent()) {
            double d0 = var0.initial.get().floatValue();
            double d1 = Math.min(var0.start, var0.end);
            double d2 = Math.max(var0.start, var0.end);
            if (d0 < d1 || d0 > d2) {
               return DataResult.error(() -> "Initial value " + d0 + " is outside of range [" + d1 + ", " + d2 + "]");
            }
         }

         return DataResult.success(var0);
      });

   private float L(float var1) {
      return this.start == this.end ? 0.5F : class04995.R(var1, this.start, this.end);
   }

   public float L() {
      return this.end;
   }

   public class09041(float start, float end, Optional<Float> initial, Optional<Float> step) {
      this.start = start;
      this.end = end;
      this.initial = initial;
      this.step = step;
   }

   public Optional<Float> i() {
      return this.step;
   }

   public Optional<Float> u() {
      return this.initial;
   }

   public float y() {
      return this.start;
   }

   private boolean y(float var1) {
      float f = this.L(var1);
      return f < 0.0 || f > 1.0;
   }

   public float N() {
      float f = this.R();
      return this.L(f);
   }

   public float N(float var1) {
      float f = class04995.B(var1, this.start, this.end);
      if (this.step.isEmpty()) {
         return f;
      } else {
         float f1 = this.step.get();
         float f2 = this.R();
         int i = Math.round((f - f2) / f1);
         float f3 = f2 + i * f1;
         if (!this.y(f3)) {
            return f3;
         } else {
            int j = i - class04995.U((double)i);
            return f2 + j * f1;
         }
      }
   }

   private float R() {
      return this.initial.isPresent() ? this.initial.get() : (this.start + this.end) / 2.0F;
   }
}
