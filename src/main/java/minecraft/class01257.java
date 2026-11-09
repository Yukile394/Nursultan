package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class01257 {
   private final class01623 i;
   final List<class01055> N;
   final List<class01055> y;
   final Function<class01055, class01894> L;
   final Consumer<class01250> u;
   private final Consumer<class01623> R;

   void L() {
      this.i.y(Lists.reverse(this.N).stream().map(class01055::M).collect(ImmutableList.toImmutableList()));
   }

   public class01257(Consumer<class01250> var1, Function<class01055, class01894> var2, class01623 var3, Consumer<class01623> var4) {
      super();
      this.u = var1;
      this.L = var2;
      this.i = var3;
      this.N = Lists.newArrayList(var3.M());
      Collections.reverse(this.N);
      this.y = Lists.newArrayList(var3.u());
      this.y.removeAll(this.N);
      this.R = var4;
      this.N(var1, var2, var3, var4, null);
   }

   public void i() {
      this.i.N();
      this.N.retainAll(this.i.u());
      this.y.clear();
      this.y.addAll(this.i.u());
      this.y.removeAll(this.N);
      this.N(null);
   }

   public void u() {
      this.L();
      this.R.accept(this.i);
   }

   public Stream<class01272> y() {
      return this.N.stream().map(var1 -> new class01277(this, var1));
   }

   public Stream<class01272> N() {
      return this.y.stream().map(var1 -> new class01254(this, var1));
   }

   private void N(Consumer var1, Function var2, class01623 var3, Consumer var4, CallbackInfo var5) {
      this.N.removeIf(var0 -> var0.fabric$isHidden());
      this.y.removeIf(var0 -> var0.fabric$isHidden());
   }

   private void N(CallbackInfo var1) {
      this.N.removeIf(var0 -> var0.fabric$isHidden());
      this.y.removeIf(var0 -> var0.fabric$isHidden());
   }
}
