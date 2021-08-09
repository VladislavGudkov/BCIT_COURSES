//LAB 5 - Vladislav Gudkov

let todos = document.getElementById("todos"); //ul
            let form = document.getElementsByTagName("form")[0];  
            let todo = document.getElementById("todoText");
            let button = document.getElementById("addTodo");
            let preview = document.getElementById("preview"); //ul
            todo.focus();   

            onkeyup = function(){
                //every timea  key is press ; copy current value of input into preview list item
                let value = todo.value;
                preview.innerHTML = value;
            }
            
            form.onsubmit = function(){
                event.preventDefault(); //stops form from submitting
                console.log(todo.value);
                
                
                //1. get text from input (todo.value)
                //2. create li element
                //3. use innerhtml to copy our text input into <li> we created like above
                //4. append to unordered list
                
                onkeyup;
                let listitem = document.createElement("li");  //2
                listitem.innerHTML = todo.value;
                todos.appendChild(listitem);  //4
}   
