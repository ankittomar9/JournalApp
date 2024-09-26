/*
package com.company.journalApp.controller;

import com.company.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/_journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> JournalEntries =new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){   //localhost:8080/journal GET
        return new ArrayList<>(JournalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){   // //localhost:8080/journal POST
        JournalEntries.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getEntryById(@PathVariable Long myId){
         return JournalEntries.get(myId);
    }

    @DeleteMapping ("id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable Long myId){
        return JournalEntries.remove(myId);
    }
    @PutMapping("id/{id}")
    public JournalEntry updateEntryById(@PathVariable Long id,@RequestBody JournalEntry myEntry){
        return JournalEntries.put(id, myEntry);
    }


}
*/
