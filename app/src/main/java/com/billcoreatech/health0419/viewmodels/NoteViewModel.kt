package com.billcoreatech.health0419.viewmodels

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.billcoreatech.health0419.database.NoteDocs
import com.billcoreatech.health0419.database.NoteDocsDao
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    private val dao: NoteDocsDao
) : ViewModel() {

    private val _notes = mutableStateListOf<NoteDocs>()
    val notes: List<NoteDocs> = _notes

    fun loadNotes() {
        viewModelScope.launch {
            _notes.clear()
            _notes.addAll(dao.getAll())
        }
    }

    fun addNote(content: String) {
        viewModelScope.launch {
            dao.insert(NoteDocs(content = content))
            loadNotes()
        }
    }
}
