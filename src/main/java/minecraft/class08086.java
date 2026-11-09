package minecraft;

import Nursultan.class10883;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class class08086 implements AutoCloseable {
   public static final class01894 N = class01894.y("main");
   private final List<class00555> y;
   private final Map<class01894, class02430> L;
   private final Set<class01894> u;
   private final Map<class01894, class08066> i = new HashMap<>();
   private final class00056 R;

   private class08086(List<class00555> var1, Map<class01894, class02430> var2, Set<class01894> var3, class00056 var4) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.R = var4;
   }

   @Override
   public void close() {
      this.i.values().forEach(class08066::N);
      this.i.clear();
      Iterator<class00555> iterator = this.y.iterator();

      while (iterator.hasNext()) {
         iterator.next().close();
      }
   }

   private static class00555 N(class08627 var0, class02433 var1, class01894 var2) throws class10883 {
      Builder builder = RenderPipeline.builder(new Snippet[]{class08394.G}).withFragmentShader(var1.L()).withVertexShader(var1.y()).withLocation(var2);

      for (class02435 class02435 : var1.u()) {
         builder.withSampler(class02435.N() + "Sampler");
      }

      builder.withUniform("SamplerInfo", class08419.field_60031);

      for (String s1 : var1.R().keySet()) {
         builder.withUniform(s1, class08419.field_60031);
      }

      RenderPipeline renderpipeline = builder.build();
      ArrayList arraylist = new ArrayList();

      for (Object object : var1.u()) {
         switch (object) {
            case class02412 class02412x:
               class02412 class02412x = class02412x;

               try {
                  s4 = class02412x.N();
               } catch (Throwable throwable8) {
                  throw new MatchException(throwable8.toString(), throwable8);
               }

               String s2 = s4;
               class02412x = class02412x;

               try {
                  class01894x = class02412x.L();
               } catch (Throwable throwable7) {
                  throw new MatchException(throwable7.toString(), throwable7);
               }

               class01894 class01894 = class01894x;
               class02412x = class02412x;

               try {
                  k = class02412x.u();
               } catch (Throwable throwable6) {
                  throw new MatchException(throwable6.toString(), throwable6);
               }

               int ix = k;
               class02412x = class02412x;

               try {
                  l = class02412x.i();
               } catch (Throwable throwable5) {
                  throw new MatchException(throwable5.toString(), throwable5);
               }

               int j = l;
               class02412x = class02412x;

               try {
                  flag5 = class02412x.R();
               } catch (Throwable throwable4) {
                  throw new MatchException(throwable4.toString(), throwable4);
               }

               boolean flag = flag5;
               class08918 class08918 = var0.y(class01894.N((UnaryOperator<String>)(var0x -> "textures/effect/" + var0x + ".png")));
               arraylist.add(new class00528(s2, class08918, ix, j, flag));
               break;
            case class02447 class02447x:
               class02447 class02447x = class02447x;

               try {
                  s3 = class02447x.N();
               } catch (Throwable throwable3) {
                  throw new MatchException(throwable3.toString(), throwable3);
               }

               String s = s3;
               class02447x = class02447x;

               try {
                  class01894xx = class02447x.L();
               } catch (Throwable throwable2) {
                  throw new MatchException(throwable2.toString(), throwable2);
               }

               class01894 class01894xxx = class01894xx;
               class02447x = class02447x;

               try {
                  flag3 = class02447x.u();
               } catch (Throwable throwable1) {
                  throw new MatchException(throwable1.toString(), throwable1);
               }

               boolean flag1 = flag3;
               class02447x = class02447x;

               try {
                  flag4 = class02447x.i();
               } catch (Throwable throwable) {
                  throw new MatchException(throwable.toString(), throwable);
               }

               boolean flag2 = flag4;
               arraylist.add(new class00572(s, class01894xxx, flag1, flag2));
               break;
            default:
               throw new MatchException(null, null);
         }
      }

      return new class00555(renderpipeline, var1.i(), var1.R(), arraylist);
   }

   private class08066 N(class01894 var1, class02456 var2) {
      class08066 class08066 = this.i.get(var1);
      if (class08066 == null || class08066.N != var2.y() || class08066.y != var2.L()) {
         if (class08066 != null) {
            class08066.N();
         }

         class08066 = var2.R();
         var2.N(class08066);
         this.i.put(var1, class08066);
      }

      return class08066;
   }

   public static class08086 N(class02414 var0, class08627 var1, Set<class01894> var2, class01894 var3, class00056 var4) throws class10883 {
      Set set = var0.y().stream().flatMap(class02433::N).filter(var1x -> !var0.N().containsKey(var1x)).collect(Collectors.toSet());
      SetView setview = Sets.difference(set, var2);
      if (!setview.isEmpty()) {
         throw new class10883("Referenced external targets are not available in this context: " + setview);
      } else {
         com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();

         for (int ix = 0; ix < var0.y().size(); ix++) {
            class02433 class02433 = var0.y().get(ix);
            builder.add(N(var1, class02433, var3.M("/" + ix)));
         }

         return new class08086(builder.build(), var0.N(), set, var4);
      }
   }

   @Deprecated
   public void N(class08066 var1, class02762 var2) {
      class02734 class02734 = new class02734();
      class08053 class08053 = class08053.N(N, class02734.N("main", var1));
      this.N(class02734, var1.N, var1.y, class08053);
      class02734.N(var2);
   }

   public void N(class02734 var1, int var2, int var3, class08053 var4) {
      GpuBufferSlice gpubufferslice = this.R.y(var2, var3);
      HashMap hashmap = new HashMap(this.L.size() + this.u.size());

      for (class01894 class01894xx : this.u) {
         hashmap.put(class01894xx, var4.y(class01894xx));
      }

      for (Entry entry : this.L.entrySet()) {
         class01894 class01894x = (class01894)entry.getKey();
         class02430 class02430 = (class02430)entry.getValue();
         class02456 class02456 = new class02456(class02430.N().orElse(var2), class02430.y().orElse(var3), true, class02430.u());
         if (class02430.L()) {
            class08066 class08066 = this.N(class01894x, class02456);
            hashmap.put(class01894x, var1.N(class01894x.toString(), class08066));
         } else {
            hashmap.put(class01894x, var1.N(class01894x.toString(), class02456));
         }
      }

      for (class00555 class00555 : this.y) {
         class00555.N(var1, hashmap, gpubufferslice);
      }

      for (class01894 class01894 : this.u) {
         var4.y(class01894, (class02452<class08066>)hashmap.get(class01894));
      }
   }
}
