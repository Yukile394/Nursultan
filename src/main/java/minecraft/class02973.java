package minecraft;

import Nursultan.class10087;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.ProviderMismatchException;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

class class02973 implements Path {
   private static final BasicFileAttributes N = new class02985();
   private static final BasicFileAttributes y = new class02967();
   private static final Comparator<class02973> L = Comparator.comparing(class02973::m);
   private final String u;
   private final class02993 i;
   @Nullable
   private final class02973 R;
   @Nullable
   private List<String> M;
   @Nullable
   private String B;
   private final class02960 Z;

   public class02973 getFileName() {
      return this.N(null, this.u);
   }

   private class02973 L(@Nullable Path var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else if (var1 instanceof class02973 class02973 && class02973.i == this.i) {
         return class02973;
      } else {
         throw new ProviderMismatchException();
      }
   }

   public boolean M() {
      return this.W();
   }

   public class02973(class02993 var1, String var2, @Nullable class02973 var3, class02960 var4) {
      super();
      this.i = var1;
      this.u = var2;
      this.R = var3;
      this.Z = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof class02973 class02973) {
         if (this.i != class02973.i) {
            return false;
         } else {
            boolean flag = this.W();
            if (flag != class02973.W()) {
               return false;
            } else {
               return flag ? this.Z == class02973.Z : Objects.equals(this.R, class02973.R) && Objects.equals(this.u, class02973.u);
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.m();
   }

   @Override
   public int hashCode() {
      return this.W() ? this.Z.hashCode() : this.u.hashCode();
   }

   @Override
   public int compareTo(Path var1) {
      class02973 class02973 = this.L(var1);
      return L.compare(this, class02973);
   }

   @Nullable
   public Path B() {
      class02960 class02960 = this.Z;
      return class02960 instanceof class10087 ? ((class10087)class02960).N() : null;
   }

   @Nullable
   public class02994 Z() {
      class02960 class02960 = this.Z;
      return class02960 instanceof class02994 ? (class02994)class02960 : null;
   }

   @Override
   public boolean startsWith(Path var1) {
      if (var1.isAbsolute() != this.isAbsolute()) {
         return false;
      } else if (var1 instanceof class02973 class02973) {
         if (class02973.i != this.i) {
            return false;
         } else {
            List<String> list = this.E();
            List<String> list1 = class02973.E();
            int ix = list1.size();
            if (ix > list.size()) {
               return false;
            } else {
               for (int j = 0; j < ix; j++) {
                  if (!list1.get(j).equals(list.get(j))) {
                     return false;
                  }
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   public class02973 normalize() {
      return this;
   }

   @Override
   public boolean endsWith(Path var1) {
      if (var1.isAbsolute() && !this.isAbsolute()) {
         return false;
      } else if (var1 instanceof class02973 class02973) {
         if (class02973.i != this.i) {
            return false;
         } else {
            List<String> list = this.E();
            List<String> list1 = class02973.E();
            int ix = list1.size();
            int j = list.size() - ix;
            if (j < 0) {
               return false;
            } else {
               for (int k = ix - 1; k >= 0; k--) {
                  if (!list1.get(k).equals(list.get(j + k))) {
                     return false;
                  }
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   private String m() {
      if (this.B == null) {
         StringBuilder stringbuilder = new StringBuilder();
         if (this.isAbsolute()) {
            stringbuilder.append("/");
         }

         Joiner.on("/").appendTo(stringbuilder, this.E());
         this.B = stringbuilder.toString();
      }

      return this.B;
   }

   @Override
   public WatchKey register(WatchService var1, Kind<?>[] var2, Modifier... var3) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean isAbsolute() {
      return this.Z != class02960.y;
   }

   public BasicFileAttributes U() throws IOException {
      if (this.Z instanceof class02994) {
         return N;
      } else if (this.Z instanceof class10087) {
         return y;
      } else {
         throw new NoSuchFileException(this.m());
      }
   }

   public BasicFileAttributeView z() {
      return new class02990(this);
   }

   @Nullable
   public class02973 getParent() {
      return this.R;
   }

   @Override
   public File toFile() {
      class02960 class02960 = this.Z;
      if (class02960 instanceof class10087) {
         return ((class10087)class02960).N().toFile();
      } else {
         throw new UnsupportedOperationException("Path " + this.m() + " does not represent file");
      }
   }

   @Nullable
   public class02973 getRoot() {
      return this.isAbsolute() ? this.i.y() : null;
   }

   public class02973 relativize(Path var1) {
      class02973 class02973 = this.L(var1);
      if (this.isAbsolute() != class02973.isAbsolute()) {
         throw new IllegalArgumentException("absolute mismatch");
      } else {
         List<String> list = this.E();
         List<String> list1 = class02973.E();
         if (list.size() >= list1.size()) {
            throw new IllegalArgumentException();
         } else {
            for (int ix = 0; ix < list.size(); ix++) {
               if (!list.get(ix).equals(list1.get(ix))) {
                  throw new IllegalArgumentException();
               }
            }

            return class02973.subpath(list.size(), list1.size());
         }
      }
   }

   private List<String> E() {
      if (this.u.isEmpty()) {
         return List.of();
      } else {
         if (this.M == null) {
            Builder builder = ImmutableList.builder();
            if (this.R != null) {
               builder.addAll(this.R.E());
            }

            builder.add(this.u);
            this.M = builder.build();
         }

         return this.M;
      }
   }

   @Override
   public int getNameCount() {
      return this.E().size();
   }

   @Override
   public URI toUri() {
      try {
         return new URI("x-mc-link", this.i.N().name(), this.m(), null);
      } catch (URISyntaxException urisyntaxexception) {
         throw new AssertionError("Failed to create URI", urisyntaxexception);
      }
   }

   private class02973 N(List<String> var1) {
      class02973 class02973 = this;

      for (String s : var1) {
         class02973 = class02973.N(s);
      }

      return class02973;
   }

   class02973 N(String var1) {
      if (N(this.Z)) {
         return new class02973(this.i, var1, this, this.Z);
      } else {
         class02960 class02960 = this.Z;
         if (class02960 instanceof class02994) {
            class02973 class02973 = ((class02994)class02960).N().get(var1);
            return class02973 != null ? class02973 : new class02973(this.i, var1, this, class02960.N);
         } else if (this.Z instanceof class10087) {
            return new class02973(this.i, var1, this, class02960.N);
         } else {
            throw new AssertionError("All content types should be already handled");
         }
      }
   }

   public class02973 resolve(Path var1) {
      class02973 class02973 = this.L(var1);
      return var1.isAbsolute() ? class02973 : this.N(class02973.E());
   }

   public class02993 getFileSystem() {
      return this.i;
   }

   public class02973 subpath(int var1, int var2) {
      List<String> list = this.E();
      if (var1 >= 0 && var2 <= list.size() && var1 < var2) {
         class02973 class02973 = null;

         for (int ix = var1; ix < var2; ix++) {
            class02973 = this.N(class02973, list.get(ix));
         }

         return class02973;
      } else {
         throw new IllegalArgumentException();
      }
   }

   private static boolean N(class02960 var0) {
      return var0 == class02960.N || var0 == class02960.y;
   }

   public class02973 toRealPath(LinkOption... var1) {
      return this.toAbsolutePath();
   }

   public class02973 getName(int var1) {
      List<String> list = this.E();
      if (var1 >= 0 && var1 < list.size()) {
         return this.N(null, list.get(var1));
      } else {
         throw new IllegalArgumentException("Invalid index: " + var1);
      }
   }

   private class02973 N(@Nullable class02973 var1, String var2) {
      return new class02973(this.i, var2, var1, class02960.y);
   }

   private boolean W() {
      return !N(this.Z);
   }

   public class02973 toAbsolutePath() {
      return this.isAbsolute() ? this : this.i.y().resolve(this);
   }
}
