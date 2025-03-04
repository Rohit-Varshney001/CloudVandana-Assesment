document.addEventListener("DOMContentLoaded", () => {
    const taskInput = document.getElementById("taskInput");
    const addTaskBtn = document.getElementById("addTaskBtn");
    const taskList = document.getElementById("taskList");

    addTaskBtn.addEventListener("click", addTask);

    function addTask() {
        const taskText = taskInput.value.trim();

        if (taskText === "") {
            alert("Please enter a task!");
            return;
        }

        // Create new list item
        const li = document.createElement("li");
        li.innerHTML = `
            ${taskText}
            <button class="delete-btn">
                <i class="fa-solid fa-trash"></i>
            </button>
        `;

        // Append task to the list
        taskList.appendChild(li);
        taskInput.value = "";

        // Add event listener to delete button
        li.querySelector(".delete-btn").addEventListener("click", function () {
            li.remove();
        });
    }
});
