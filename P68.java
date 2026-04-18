MergeSort(arr, left, right):
    if left < right:
        mid = (left + right) // 2

        MergeSort(arr, left, mid)
        MergeSort(arr, mid + 1, right)

        Merge(arr, left, mid, right)

Merge(arr, left, mid, right):
    create two temporary arrays L and R

    copy data into L and R

    i = 0, j = 0, k = left

    while i < size(L) and j < size(R):
        if L[i] <= R[j]:
            arr[k] = L[i]
            i++
        else:
            arr[k] = R[j]
            j++
        k++

    copy remaining elements of L
    copy remaining elements of R
