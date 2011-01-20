
30 May 2004. Current results from: linklint -error -warn -index changes.html /@

#-
# ERROR   1 missing html file
#-
/New/ChangedField.html
 - Error in @link in Javadoc text for test/new/ChangedPackageDoc2/ChangedField.java:unchanged. Not seen unless -docchanges is used.

#-
# ERROR   2 missing named anchors
#-
/Old/ChangedPackage/ChangedChild.html#MovingField2
/Old/ChangedPackage/ChangedChild.html#MovingMethod2()

- These anchors both refer to elements which moved from a parent class
to a child class. They both actually do exist, in
changes/ChangedPackage.ChangedParent.html, the first one as seen above, and
the second with a suffix as :
ChangedPackage.ChangedParent.MovingMethod2_removed()

One thought: these may have been anchors which were inserted even
though Javadoc didn't create them. but the links still work to the
page for that class, so users will probably never notice.

However, no problems at all are seen with the existing test/build.xml, so I have added this as a bug
