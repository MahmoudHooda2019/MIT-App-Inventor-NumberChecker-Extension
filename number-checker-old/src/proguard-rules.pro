# Add any ProGuard configurations specific to this
# extension here.

-keep public class mh.math.numberchecker.NumberChecker {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'mh/math/numberchecker/repack'
-flattenpackagehierarchy
-dontpreverify
