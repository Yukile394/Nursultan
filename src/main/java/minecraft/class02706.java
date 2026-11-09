package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public record class02706(class02826<String> title, String author, int generation, List<class02826<class00392>> pages, boolean resolved)
   implements class02499<class00392, class02706>,
   class02694 {
   public static final class02706 N = new class02706(class02826.N(""), "", 0, List.of(), true);
   public static final int y = 32767;
   public static final int L = 16;
   public static final int u = 32;
   public static final int i = 3;
   public static final int R = 2;
   public static final Codec<class00392> M = class03748.N(32767);
   public static final Codec<List<class02826<class00392>>> B = N(M);
   public static final Codec<class02706> Z = RecordCodecBuilder.create(
      var0 -> var0.group(
            class02826.N(Codec.string(0, 32)).fieldOf("title").forGetter(class02706::u),
            Codec.STRING.fieldOf("author").forGetter(class02706::i),
            class06338.N(0, 3).optionalFieldOf("generation", 0).forGetter(class02706::R),
            B.optionalFieldOf("pages", List.of()).forGetter(class02706::N),
            Codec.BOOL.optionalFieldOf("resolved", false).forGetter(class02706::M)
         )
         .apply(var0, class02706::new)
   );
   public static final class02362<class04247, class02706> z = class02362.N(
      class02826.N(class02389.y(32)),
      class02706::u,
      class02389.s,
      class02706::i,
      class02389.B,
      class02706::R,
      class02826.N(class03748.y).N_33(class02389.N()),
      class02706::N,
      class02389.y,
      class02706::M,
      class02706::new
   );

   public class02706 L() {
      return new class02706(this.title, this.author, this.generation, this.pages, true);
   }

   public boolean M() {
      return this.resolved;
   }

   public class02706(class02826<String> title, String author, int generation, List<class02826<class00392>> pages, boolean resolved) {
      super();
      if (generation >= 0 && generation <= 3) {
         this.title = title;
         this.author = author;
         this.generation = generation;
         this.pages = pages;
         this.resolved = resolved;
      } else {
         throw new IllegalArgumentException("Generation was " + generation + ", but must be between 0 and 3");
      }
   }

   public String i() {
      return this.author;
   }

   public class02826<String> u() {
      return this.title;
   }

   private static Codec<class02826<class00392>> y(Codec<class00392> var0) {
      return class02826.N(var0);
   }

   @Nullable
   public class02706 y() {
      return this.generation >= 2 ? null : new class02706(this.title, this.author, this.generation + 1, this.pages, this.resolved);
   }

   private static Optional<class02826<class00392>> N(class07701 var0, @Nullable class08036 var1, class02826<class00392> var2) {
      return var2.y(var2x -> {
         try {
            class05216 class05216 = class00390.N(var0, var2x, var1, 0);
            return N(class05216, var0.t()) ? Optional.empty() : Optional.of(class05216);
         } catch (Exception exception) {
            return Optional.of(var2x);
         }
      });
   }

   private static boolean N(class00392 var0, class01929 var1) {
      DataResult dataresult = class03748.N.encodeStart(var1.N(JsonOps.INSTANCE), var0);
      return dataresult.isSuccess() && class05001.N((JsonElement)dataresult.getOrThrow(), 32767);
   }

   @Override
   public List<class02826<class00392>> N() {
      return this.pages;
   }

   public static boolean N(class06584 var0, class07701 var1, @Nullable class08036 var2) {
      class02706 class02706x = var0.method_58694(class02484.NL);
      if (class02706x != null && !class02706x.M()) {
         class02706 class02706x = class02706x.N(var1, var2);
         if (class02706x != null) {
            var0.N(class02484.NL, class02706x);
            return true;
         }

         var0.N(class02484.NL, class02706x.L());
      }

      return false;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      if (!class05018.B(this.author)) {
         var2.accept(class00392.N("book.byAuthor", this.author).N(class06541.field_1080));
      }

      var2.accept(class00392.L("book.generation." + this.generation).N(class06541.field_1080));
   }

   public static Codec<List<class02826<class00392>>> N(Codec<class00392> var0) {
      return y(var0).listOf();
   }

   public class02706 y(List<class02826<class00392>> var1) {
      return new class02706(this.title, this.author, this.generation, var1, false);
   }

   public List<class00392> N(boolean var1) {
      return Lists.transform(this.pages, var1x -> (class00392)var1x.N(var1));
   }

   @Nullable
   public class02706 N(class07701 var1, @Nullable class08036 var2) {
      if (this.resolved) {
         return null;
      } else {
         Builder builder = ImmutableList.builderWithExpectedSize(this.pages.size());

         for (class02826 class02826 : this.pages) {
            Optional optional = N(var1, var2, class02826);
            if (optional.isEmpty()) {
               return null;
            }

            builder.add((class02826)optional.get());
         }

         return new class02706(this.title, this.author, this.generation, builder.build(), true);
      }
   }

   public int R() {
      return this.generation;
   }
}
