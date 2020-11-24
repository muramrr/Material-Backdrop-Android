# Backdrop-MotionLayout
Android material backdrop

<img src="/preview.gif" alt="sample" title="sample" align="right" vspace="52" height="500"/>

Material backdrop concept representation in Android as simple as possible.

See [Material guidelines for backdrop](https://material.io/components/backdrop)

### Explanations

Only base features of MotionLayout used to achieve such behaviour.

```xml
<MotionScene ...
  >
	
  <Transition app:constraintSetStart="@id/backdropCollapsed"
    app:constraintSetEnd="@id/backdropExpanded">
		
    <OnSwipe app:dragDirection="dragUp"
      app:touchAnchorId="@id/frontContentContainer"
      app:dragScale="1.5" <-- makes swipe more natural by increasing its scale by 150%
      app:nestedScrollFlags="disableScroll" <-- important, this flag prevent -->
      <-- starting transition when RecyclerView reaches the start (or the end) after scroll -->
      />
		
    ...
	
  </Transition>
  
  
  <ConstraintSet android:id="@+id/backdropCollapsed" /> <-- base state (mathes our activity_main.xml) -->
	
  <ConstraintSet android:id="@+id/backdropExpanded">

    <Constraint android:id="@+id/frontContentContainer"
      android:layout_width="0dp"
      android:layout_height="0dp"

      app:layout_constraintBottom_toBottomOf="parent"
      app:layout_constraintStart_toStartOf="parent"
      app:layout_constraintEnd_toEndOf="parent"
      
      app:layout_constraintTop_toBottomOf="@id/backdropBackground"  <-- main difference,
      <--  makes our RecyclerView container align bottom of backdrop content -->
      <--  this gives us imitation of BottomSheet appearance and elevation -->
     
      />

  </ConstraintSet>


</MotionScene>

```
