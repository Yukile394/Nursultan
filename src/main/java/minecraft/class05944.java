package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public final class class05944 extends class05978 implements class07583 {
   private static final int L = 32;
   private final class05231 u;
   private final class06202 i;
   private final class05096 R;
   final class06434 N;
   private final class04182 M;
   private final class02071 B;
   private final class02071 Z;
   private final class02071 z;
   @Nullable
   private Path U;

   public void L() {
      this.i
         .N(
            new class05733(
               var1 -> {
                  if (var1) {
                     this.i.N(new class05125(true));
                     this.u();
                  }

                  this.u.u();
               },
               class00392.L("selectWorld.deleteQuestion"),
               class00392.N("selectWorld.deleteWarning", this.N.y()),
               class00392.L("selectWorld.deleteButton"),
               class05220.i
            )
         );
   }

   public class05944(class05231 var1, class05231 var2, class06434 var3) {
      super();
      this.y = var1;
      this.u = var2;
      this.i = class05231.N(var2);
      this.R = var2.i();
      this.N = var3;
      this.M = class04182.N(this.i.NO(), var3.N());
      this.U = var3.L();
      int ix = var2.method_25322() - this.E() - 2;
      class05216 class05216x = class00392.y(var3.y());
      this.B = new class02071(class05216x, (class01590)this.i.i_3);
      this.B.N(ix);
      if (((class01590)this.i.i_3).N(class05216x) > ix) {
         this.B.method_47400(class04141.N(class05216x));
      }

      String s = var3.N();
      long j = var3.R();
      if (j != -1L) {
         ZonedDateTime zoneddatetime = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneId.systemDefault());
         s = s + " (" + class05231.N.format(zoneddatetime) + ")";
      }

      class05216 class05216x = class00392.y(s).y(-8355712);
      this.Z = new class02071(class05216x, (class01590)this.i.i_3);
      this.Z.N(ix);
      if (((class01590)this.i.i_3).y(s) > ix) {
         this.Z.method_47400(class04141.N(class05216x));
      }

      class00392 class00392 = class00390.N(var3.j(), class00405.N.N(-8355712));
      this.z = new class02071(class00392, (class01590)this.i.i_3);
      this.z.N(ix);
      if (((class01590)this.i.i_3).N(class00392) > ix) {
         this.z.method_47400(class04141.N(class00392));
      }

      this.U();
      this.m();
   }

   public String Z() {
      return this.N.y();
   }

   public void i() {
      this.W();
      String s = this.N.N();

      class04785 class04785;
      try {
         class04785 = this.i.NL().u(s);
      } catch (IOException ioexception1) {
         class06132.N(this.i, s);
         class05231.z.error("Failed to access level {}", s, ioexception1);
         this.u.y();
         return;
      } catch (class04151 class04151) {
         class05231.z.warn("{}", class04151.getMessage());
         this.i.N(class01864.N(() -> this.i.N(this.R)));
         return;
      }

      class05227 class05227;
      try {
         class05227 = class05227.N(this.i, class04785, var2x -> {
            class04785.L();
            this.u.u();
         });
      } catch (class03142 | class03103 | IOException ioexception) {
         class04785.L();
         class06132.N(this.i, s);
         class05231.z.error("Failed to load world data {}", s, ioexception);
         this.u.y();
         return;
      }

      this.i.N(class05227);
   }

   private void m() {
      if (this.U != null && Files.isRegularFile(this.U)) {
         try (InputStream inputstream = Files.newInputStream(this.U)) {
            this.M.N(class08280.N(inputstream));
         } catch (Throwable throwable) {
            class05231.z.error("Invalid icon for world {}", this.N.N(), throwable);
            this.U = null;
         }
      } else {
         this.M.N();
      }
   }

   private void U() {
      if (this.U != null) {
         try {
            BasicFileAttributes basicfileattributes = Files.readAttributes(this.U, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            if (basicfileattributes.isSymbolicLink()) {
               List<class04168> list = this.i.Ni().N(this.U);
               if (!list.isEmpty()) {
                  class05231.z.warn("{}", class04151.N(this.U, list));
                  this.U = null;
               } else {
                  basicfileattributes = Files.readAttributes(this.U, BasicFileAttributes.class);
               }
            }

            if (!basicfileattributes.isRegularFile()) {
               this.U = null;
            }
         } catch (NoSuchFileException nosuchfileexception) {
            this.U = null;
         } catch (IOException ioexception) {
            class05231.z.error("could not validate symlink", ioexception);
            this.U = null;
         }
      }
   }

   @Override
   public void close() {
      if (!this.M.L()) {
         this.M.close();
      }
   }

   @Override
   public class06434 z() {
      return this.N;
   }

   public void u() {
      class04777 class04777 = this.i.NL();
      String s = this.N.N();

      try (class04785 class04785 = class04777.i(s)) {
         class04785.U();
      } catch (IOException ioexception) {
         class06132.y(this.i, s);
         class05231.z.error("Failed to delete world {}", s, ioexception);
      }
   }

   public void y() {
      if (this.N.n()) {
         if (this.N instanceof class06479) {
            this.i.N(class01864.N(() -> this.i.N(this.R)));
         } else {
            this.i.S().N(this.N.N(), this.u::u);
         }
      }
   }

   private int E() {
      return this.method_73380() + 32 + 3;
   }

   public boolean N() {
      return this.N.n() || this.u.j == class05217.field_62202;
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.L() && this.N()) {
         this.i.Nr().N(class00040.N(class04909.OK, 1.0F));
         Consumer<class05944> consumer = this.u.v;
         if (consumer != null) {
            consumer.accept(this);
            return true;
         }
      }

      return super.method_25404(var1);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (this.N()) {
         int ix = (int)var1.n() - this.method_73380();
         int j = (int)var1.t() - this.method_73382();
         if (var2 || this.N(ix, j, 32) && this.u.j == class05217.field_62201) {
            this.i.Nr().N(class00040.N(class04909.OK, 1.0F));
            Consumer<class05944> consumer = this.u.v;
            if (consumer != null) {
               consumer.accept(this);
               return true;
            }
         }
      }

      return super.method_25402(var1, var2);
   }

   private void W() {
      this.i.y(new class06307(class00392.L("selectWorld.data_read")));
   }

   public void R() {
      this.W();

      try (class04785 class04785 = this.i.NL().u(this.N.N())) {
         Pair<class07312, class01896> pair = this.i.S().N(class04785);
         class07312 class07312 = (class07312)pair.getFirst();
         class01896 class01896 = (class01896)pair.getSecond();
         Path path = class05213.N(class04785.N(class05071.z), this.i);
         class01896.y();
         if (class01896.L().R()) {
            this.i
               .N(
                  new class05733(
                     var4x -> this.i.N((class05096)(var4x ? class05213.N(this.i, this.u::u, class07312, class01896, path) : this.R)),
                     class00392.L("selectWorld.recreate.customized.title"),
                     class00392.L("selectWorld.recreate.customized.text"),
                     class05220.Z,
                     class05220.i
                  )
               );
         } else {
            this.i.N(class05213.N(this.i, this.u::u, class07312, class01896, path));
         }
      } catch (class04151 class04151) {
         class05231.z.warn("{}", class04151.getMessage());
         this.i.N(class01864.N(() -> this.i.N(this.R)));
      } catch (Exception exception) {
         class05231.z.error("Unable to recreate world", exception);
         this.i.N(new class01304(() -> this.i.N(this.R), class00392.L("selectWorld.recreate.error.title"), class00392.L("selectWorld.recreate.error.text")));
      }
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      int ix = this.E();
      this.B.y(ix, this.method_73382() + 1);
      this.B.method_25394(var1, var2, var3, var5);
      this.Z.y(ix, this.method_73382() + 9 + 3);
      this.Z.method_25394(var1, var2, var3, var5);
      this.z.y(ix, this.method_73382() + 9 + 9 + 3);
      this.z.method_25394(var1, var2, var3, var5);
      var1.N(class08394.Na, this.M.y(), this.method_73380(), this.method_73382(), 0.0F, 0.0F, 32, 32, 32, 32);
      if (this.u.j == class05217.field_62201 && (((class05630)this.i.i_7).Nm().method_41753() || var4)) {
         var1.N(this.method_73380(), this.method_73382(), this.method_73380() + 32, this.method_73382() + 32, -1601138544);
         int j = var2 - this.method_73380();
         int k = var3 - this.method_73382();
         boolean flag = this.N(j, k, 32);
         class01894 class01894xxx = flag ? class05231.B : class05231.Z;
         class01894 class01894x = flag ? class05231.R : class05231.M;
         class01894 class01894xx = flag ? class05231.y : class05231.L;
         class01894 class01894xxx = flag ? class05231.u : class05231.i;
         if (this.N instanceof class06479 || this.N instanceof class06435) {
            var1.N(class08394.Na, class01894xx, this.method_73380(), this.method_73382(), 32, 32);
            var1.N(class08394.Na, class01894xxx, this.method_73380(), this.method_73382(), 32, 32);
            return;
         }

         if (this.N.s()) {
            var1.N(class08394.Na, class01894xx, this.method_73380(), this.method_73382(), 32, 32);
            if (flag) {
               var1.N(((class01590)this.i.i_3).L(class05231.P, 175), var2, var3);
            }
         } else if (this.N.u()) {
            var1.N(class08394.Na, class01894xx, this.method_73380(), this.method_73382(), 32, 32);
            if (flag) {
               var1.N(((class01590)this.i.i_3).L(class05231.s, 175), var2, var3);
            }
         } else if (!this.N.b()) {
            var1.N(class08394.Na, class01894xx, this.method_73380(), this.method_73382(), 32, 32);
            if (flag) {
               var1.N(((class01590)this.i.i_3).L(class05231.T, 175), var2, var3);
            }
         } else if (this.N.W()) {
            var1.N(class08394.Na, class01894xxx, this.method_73380(), this.method_73382(), 32, 32);
            if (this.N.m()) {
               var1.N(class08394.Na, class01894xx, this.method_73380(), this.method_73382(), 32, 32);
               if (flag) {
                  var1.N(ImmutableList.of(class05231.U.method_30937(), class05231.E.method_30937()), var2, var3);
               }
            } else if (!class07529.y().comp_4031()) {
               var1.N(class08394.Na, class01894x, this.method_73380(), this.method_73382(), 32, 32);
               if (flag) {
                  var1.N(ImmutableList.of(class05231.W.method_30937(), class05231.m.method_30937()), var2, var3);
               }
            }

            if (flag) {
               class05231.N(this.y, var1);
            }
         } else {
            var1.N(class08394.Na, class01894xxx, this.method_73380(), this.method_73382(), 32, 32);
            if (flag) {
               class05231.y(this.y, var1);
            }
         }
      }
   }

   @Override
   public class00392 method_37006() {
      class05216 class05216 = class00392.N("narrator.select.world_info", this.N.y(), class00392.N(new Date(this.N.R())), this.N.j());
      if (this.N.s()) {
         class05216 = class05220.N(class05216, class05231.P);
      }

      if (this.N.i()) {
         class05216 = class05220.N(class05216, class05231.b);
      }

      return class00392.N("narrator.select", class05216);
   }
}
