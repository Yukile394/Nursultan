package minecraft;

import Nursultan.class10466;
import Nursultan.class10469;
import com.google.common.collect.Maps;
import com.mojang.serialization.Dynamic;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.zip.ZipOutputStream;
import org.jspecify.annotations.Nullable;

public class class04785 implements AutoCloseable {
   public final class05323 N;
   public final class04779 y;
   private final String u;
   private final Map<class05071, Path> i;

   public void L() {
      try {
         this.close();
      } catch (IOException ioexception) {
         class04777.N.warn("Failed to unlock access to level {}", this.R(), ioexception);
      }
   }

   public class07842 M() {
      this.P();
      return new class07842(this, this.L.u);
   }

   private void P() {
      if (!this.N.N()) {
         throw new IllegalStateException("Lock is no longer valid");
      }
   }

   class04785(class04777 var1, String var2, Path var3) throws IOException {
      super();
      this.L = var1;
      this.i = Maps.newHashMap();
      this.u = var2;
      this.y = new class04779(var3);
      this.N = class05323.N(var3);
   }

   public Dynamic<?> B() throws IOException {
      return this.y(false);
   }

   public Dynamic<?> Z() throws IOException {
      return this.y(true);
   }

   public class04779 i() {
      return this.y;
   }

   public boolean m() {
      return class07536.N(this.y.y(), this.y.L(), this.y.N(ZonedDateTime.now()), true);
   }

   public void U() throws IOException {
      this.P();
      Path path = this.y.i();
      class04777.N.info("Deleting level {}", this.u);

      for (int ix = 1; ix <= 5; ix++) {
         class04777.N.info("Attempt {}...", ix);

         try {
            Files.walkFileTree(this.y.R(), new class10466(this, path));
            break;
         } catch (IOException ioexception) {
            if (ix >= 5) {
               throw ioexception;
            }

            class04777.N.warn("Failed to delete {}", this.y.R(), ioexception);

            try {
               Thread.sleep(500L);
            } catch (InterruptedException interruptedexception) {
            }
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.N.close();
   }

   public Optional<Path> z() {
      return !this.N.N() ? Optional.empty() : Optional.of(this.y.u());
   }

   public class04777 u() {
      return this.L;
   }

   private Dynamic<?> y(boolean var1) throws IOException {
      this.P();
      return class04777.N(var1 ? this.y.L() : this.y.y(), this.L.u);
   }

   public void y(String var1) throws IOException {
      this.N((Consumer<class07001>)(var1x -> {
         var1x.N_67("LevelName", var1.trim());
         var1x.b("Player");
      }));
   }

   public boolean y() {
      return this.N() < 67108864L;
   }

   public long E() throws IOException {
      this.P();
      String s = class03804.N.format(ZonedDateTime.now()) + "_" + this.u;
      Path path = this.L.u();

      try {
         class06290.L(path);
      } catch (IOException ioexception) {
         throw new RuntimeException(ioexception);
      }

      Path path1 = path.resolve(class06290.N(path, s, ".zip"));

      try (ZipOutputStream zipoutputstream = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path1)))) {
         Path path2 = Paths.get(this.u);
         Files.walkFileTree(this.y.R(), new class10469(this, path2, zipoutputstream));
      }

      return Files.size(path1);
   }

   public long N() {
      try {
         return Files.getFileStore(this.y.R()).getUsableSpace();
      } catch (Exception exception) {
         return Long.MAX_VALUE;
      }
   }

   private void N(Consumer<class07001> var1) throws IOException {
      this.P();
      class07001 class07001 = class04777.L(this.y.y());
      var1.accept(class07001.m("Data"));
      this.N(class07001);
   }

   @Nullable
   public Instant N(boolean var1) {
      return class04777.u(var1 ? this.y.L() : this.y.y());
   }

   public void N(class01042 var1, class05081 var2) {
      this.N(var1, var2, null);
   }

   public Path N(class05071 var1) {
      return this.i.computeIfAbsent(var1, this.y::N);
   }

   public class06434 N(Dynamic<?> var1) {
      this.P();
      return this.L.N(var1, this.y, false);
   }

   private void N(class07001 var1) {
      Path path = this.y.R();

      try {
         Path path1 = Files.createTempFile(path, "level", ".dat");
         class07742.N(var1, path1);
         Path path2 = this.y.L();
         class07536.N(this.y.y(), path1, path2);
      } catch (Exception exception) {
         class04777.N.error("Failed to save level {}", path, exception);
      }
   }

   public void N(class01042 var1, class05081 var2, @Nullable class07001 var3) {
      class07001 class07001x = var2.N(var1, var3);
      class07001 class07001x = new class07001();
      class07001x.N("Data", class07001x);
      this.N(class07001x);
   }

   public Path N(class05946<class07299> var1) {
      return class07376.N(var1, this.y.R());
   }

   public void N(String var1) throws IOException {
      this.N((Consumer<class07001>)(var1x -> var1x.N_67("LevelName", var1.trim())));
   }

   public boolean W() {
      return Files.exists(this.y.y()) || Files.exists(this.y.L());
   }

   public String R() {
      return this.u;
   }
}
